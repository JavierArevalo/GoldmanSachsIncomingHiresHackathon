package com.mkyong.hashing;

import org.apache.http.client.HttpClient;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.Consts;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.fluent.*;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import com.google.gson.JsonParser;
import org.apache.http.Consts;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import java.util.ArrayList;
import java.util.List;


import java.util.Scanner;


public class BackendServer {
    public static HttpClient httpClient = HttpClientBuilder.create().build();
    public static void main(String[] args) throws java.io.IOException, Exception {


        Content c = Request.Post("https://idfs.gs.com/as/token.oauth2")
                .bodyForm(Form.form()
                        .add("grant_type",    "client_credentials")
                        .add("client_id",     "db21815ca4694a7ea4fb01088c67c76a")
                        .add("client_secret", "bc03aad2f387f24885e4f153f613bca01cdee70f313266723948e95f1417cb22")
                        .add("scope",         "read_content read_financial_data read_product_data read_user_profile")
                        .build()
                )
                .execute().returnContent();
        String accessToken = new ObjectMapper().readTree(c.asString()).get("access_token").asText();
        System.out.println(accessToken);
        String PATH= "https://api.marquee.gs.com/v1/users/self";

        String serviceResponse = Request.Get(PATH)
                .addHeader("Authorization", "Bearer " + accessToken)
                .execute().returnContent().asString();
        System.out.println(serviceResponse);


        //Option 1: use dummy Portfolio data for simplicity and avoid using another API
        //generate fake PortfolioMock info as a 2D string of form: array[0] = [assetName, amount]
        String[][] portfolioMock = {
                {"Microsoft", "10"},
                {"Apple", "11"},
                {"Facebook", "8"},
                {"Goldman Sachs", "10"},
                {"JPMorgan", "5"},
                {"UBS", "11"}
        };

        PortfolioMock mockPortfolio = new PortfolioMock(portfolioMock);
        Portfolio portfolio = mockPortfolio.getPortfolio();

        BackendServer.renderInstruments(portfolio);



        BackendServer.renderIncreaseOptionInstruments(portfolio, accessToken);

        //To do: implement option of allowing user to schedule trade based on execution time


        //Option 2: use the getPortfolio API
        HttpGet requestGet = new HttpGet("https://api.marquee.gs.com/v1/portfolios");
        requestGet.setHeader("Authorization", "Bearer " + accessToken);
        String response = EntityUtils.toString(httpClient.execute(requestGet).getEntity());




    }

    //To do:
    //missing: add total dollar amount
    //Need to figure out value of stock and then just print (amount * value) as dollar value
    //change the system.out.println to render in front end instead of printing to console
    public static void renderInstruments(Portfolio portfolio) throws Exception {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Current Portfolio: ");
        System.out.println();

        ArrayList<String> assetNames = portfolio.getCompleteListAssetNames();

        int size = assetNames.size();

        for (int i = 0; i < size; i++) {

            String assetName = assetNames.get(i);

            TradePosition tradePosition = portfolio.getTrade(assetName);
            double amount = tradePosition.getAmount();

            //Change the system.out.println to print in front end when connecting it
            //Modify below line to include total dollar amount
            //Final form: Asset A: 3 shares of Apple worth "total dollar amount"
            System.out.println("Asset A: " + amount + " shares of " + assetName);
        }

    }

    //To do:
    //missing: add drop down bottom instead of 1 below (do in front end and
    public static void renderIncreaseOptionInstruments(Portfolio portfolio, String accessToken) throws Exception {

        System.out.println();
        System.out.println();
        System.out.println();

        ArrayList<String> assetNames = portfolio.getCompleteListAssetNames();

        int size = assetNames.size();
        for (int i = 0; i < size; i++) {

            String assetName = assetNames.get(i);
            int amount = 1;

            //To do:
            //Find a way to read input from user from dropdown menu/type and set it to amount
            //Until we find a way to do this use default value of 1

            System.out.println("Would you like to consider buying more shares of " + assetName + "?");
            System.out.println("Enter (1) for YES and (0) for NO");
            System.out.println();


            boolean validInput = false;

            while (!validInput) {
                System.out.println("Please enter your choice: ");

                Scanner userInput = new Scanner(System.in);

                while (!userInput.hasNext());

                String input = "";
                if (userInput.hasNext()) {
                    input = userInput.nextLine();
                }
                if (!BackendServer.isValid(input)) {
                    validInput = false;
                    System.out.println("Please enter one of the two options, (1) for YES or (0) for NO");
                }

                validInput = true;

                amount = Integer.parseInt(input);
            }



            BackendServer.renderIncreaseOptionInstrument(portfolio, assetName, amount, accessToken);

        }

    }

    public static double getBeta(String assetName) throws Exception{
        if (assetName.equals("Microsoft")) {
            return 0.82;
        } else if (assetName.equals("Apple")) {
            return 1.30;
        } else if (assetName.equals("Facebook")) {
            return 1.19;
        } else if (assetName.equals("Goldman Sachs")) {
            return 1.48;
        } else if (assetName.equals("JPMorgan")) {
            return 1.21;
        } else if (assetName.equals("UBS")) {
            return 1.24;
        }
        throw new Exception("Beta value not found since " + assetName + " is not currently in demo portfolio. ");
    }

    public static double getReturnOnCommonEquity(String assetName) throws Exception {

        if (assetName.equals("UBS")) {
            return 9.8;
        } else if (assetName.equals("JPMorgan")) {
            return 15.0;
        } else if (assetName.equals("Goldman Sachs")) {
            return 10.0;
        } else if (assetName.equals("Facebook")) {
            return 23.9;
        } else if (assetName.equals("Apple")) {
            return 50.5;
        } else if (assetName.equals("Microsoft")) {
            return 32.2;
        }
        throw new Exception("Return on Common Equity not found since " + assetName + " is not currently in demo portfolio. ");


    }

    public static void renderIncreaseOptionInstrument(Portfolio portfolio, String assetName, double amount, String accessToken) throws Exception {

        if (amount == 0) {
            return;
        }

        /**
         * Use following values to get an estimate of the expected return of an asset
         * based on the Capital Asset Pricing Model.
         * Hardcoded companies beta values since access to API that gets Beta values was restricted
         * Used the 10 year US Government bond as a proxy for the riskFreeReturn
         * Use the S&P Monthly returns * 12 as proxy of expected Market Return
         * Calculated expectedReturnAsset = riskFreeReturn + (beta*(expectedMarketReturn - riskFreeReturn)
         */
        double beta = BackendServer.getBeta(assetName);
        double riskFreeReturn = 0.009;
        double expectedMarketReturn = 0.056;

        double expectedReturnAsset = 100* (riskFreeReturn + (beta*(expectedMarketReturn - riskFreeReturn)));

        //represent as a percent (already including '%')
        double returnOnCommonEquity = BackendServer.getReturnOnCommonEquity(assetName);

        TradePosition tradePosition = portfolio.getTrade(assetName);

        System.out.println("If you buy " + amount + " shares of " + assetName + " please consider the following report: ");

        System.out.println();
        System.out.println();
        System.out.println("Key Financial Report for asset " + assetName + "  being considsered: ");
        System.out.println();
        System.out.println();
        System.out.println("Expected Return on " + assetName + " based on Capital Asset Pricing Model is " + expectedReturnAsset + "%.");
        System.out.println();
        System.out.println("Historical Beta (asset's systematic risk) of " + assetName + " is " + beta + ".");
        System.out.println();
        System.out.println("Return on common equity of " + assetName + " is " + returnOnCommonEquity + "%.");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();



        PreTradeOptimizationMock optimizationMock = new PreTradeOptimizationMock();
        PreTradeOptimizationResultMock resultMock = optimizationMock.loadData1();


        System.out.println("Would you like to see the complete technical report on " + assetName + "'s Pretrade Optimization and Analytics Result model?");
        System.out.println("Enter (1) for YES and (0) for NO");


        boolean validInput = false;
        int choice = 0;

        while (!validInput) {
            System.out.println("Please enter your choice: ");

            Scanner userInput = new Scanner(System.in);

            while (!userInput.hasNext());

            String input = "";
            if (userInput.hasNext()) {
                input = userInput.nextLine();
            }
            if (!BackendServer.isValid(input)) {
                validInput = false;
                System.out.println("Please enter one of the two options, (1) for YES or (0) for NO");
            }

            validInput = true;

            choice = Integer.parseInt(input);
        }

        if (choice == 1) {
            resultMock.print();
        }


        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Actual call to API (forbidden access currently): ");



        HttpPost requestPost = new HttpPost("https://api.marquee.gs.com/v1/risk/execution/pretrade");
        requestPost.setHeader("Authorization", "Bearer " + accessToken);

        requestPost.setEntity(new StringEntity("{\"type\":\"APEX\", \"positions\":[{\"assetId\":\"MA4B66MW5E27UANEQ29\",\"quantity\":-31927}],\"executionStartTime\":\"2020-04-30T02:00:00.000Z\",\"executionEndTime\":\"2020-04-30T21:00:00.000Z\",\"waitForResults\":true,\"parameters\":{\"urgency\":\"MEDIUM\",\"targetBenchmark\":\"CLOSE\",\"imbalance\":0.9,\"participationRate\":0.1}}"));
        requestPost.setHeader("Content-Type", "application/json");
        requestPost.setHeader("Accept", "application/json");
        String response = EntityUtils.toString(httpClient.execute(requestPost).getEntity());

        System.out.println(" can be found response by using the following Marquee unique identifier " + response);

        System.out.println();
        System.out.println();
    }

    public static boolean isValid(String strNum) {

        if (strNum == null) {
            return false;
        }
        int a = 0;
        try {
            a = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        if (a == 0 || a == 1) {
            return true;
        }

        return false;
    }

}