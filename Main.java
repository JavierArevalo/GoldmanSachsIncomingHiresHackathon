package com.mkyong.hashing;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.fluent.*;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.entity.ContentType;

import org.apache.http.Consts;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import java.util.ArrayList;
import java.util.List;



public class Main {
    public static HttpClient httpClient = HttpClientBuilder.create().build();
    public static void main(String[] args) throws java.io.IOException, Exception {

        Content c = Request.Post("http://idfs.gs.com/as/token.auth2")
                .bodyForm(Form.form()
                        .add("grant_type", "client_credentials")
                        .add("client_id", "07db84747d8b4f039dfe072cc46d1d43")
                        .add("client_secret", "2d2e352965bf8d6a4967381e8fdf1c4d539cc9a548a40aee60af375c4bf374af")
                        .add("scope", "read_content read_financial_data read_product_data read_user_profile")
                        .build()
                    )
                    .execute().returnContent();

        String accessToken = new ObjectMapper().readTree(c.asString()).get("access_token").asText();

        String serviceResponse = Request.Get("https://api.marquee.gs.com/v1/users/self")
                .addHeader("Authorization", "Bearer " + accessToken)
                .execute().returnContent().asString();


        //Option 1: use dummy Portfolio data for simplicity and avoid using another API
        //generate fake PortfolioMock info as a 2D string of form: array[0] = [assetName, amount]
        String[][] portfolioMock = {
                {"Microsoft", "Apple", "Facebook", "Goldman Sachs", "JPMorgan", "UBS"},
                {"10.0", "11.0", "8.0", "20.0", "-10.0", "-11.0"}
        };

        PortfolioMock mockPortfolio = new PortfolioMock(portfolioMock);
        Portfolio portfolio = mockPortfolio.getPortfolio();

        Main.renderInstruments(portfolio, accessToken);

        Main.renderIncreaseOptionInstruments(portfolio, accessToken);

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
    public static void renderInstruments(Portfolio portfolio, String accessToken) throws Exception {

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

        ArrayList<String> assetNames = portfolio.getCompleteListAssetNames();

        int size = assetNames.size();
        for (int i = 0; i < size; i++) {

            String assetName = assetNames.get(i);

            //To do:
            //Find a way to read input from user from dropdown menu/type and set it to amount
            //Until we find a way to do this use default value of 1
            int amount = 1;

            Main.renderIncreaseOptionInstrument(portfolio, assetName, amount, accessToken);

        }

    }

    //To do:
    //Find a way to get actual optimal execution time from API instead of just an ID to show to user
    public static void renderIncreaseOptionInstrument(Portfolio portfolio, String assetName, int amount, String accessToken) throws Exception {

        TradePosition tradePosition = portfolio.getTrade(assetName);

        System.out.println("If you buy " + amount + " shares of " + assetName + " the best execution time ");

        //Find best execution time
        HttpPost requestPost = new HttpPost("https://api.marquee.gs.com/v1/risk/execution/pretrade");
        requestPost.setHeader("Authorization", "Bearer " + accessToken);

        //how do I find the assetId of a stock given its name?
        requestPost.setEntity(new StringEntity("{\"positions\":[{\"assetId\":\"MA4B66MW5E27UANEQ29\",\"quantity\":amount}],\"executionStartTime\":\"2020-04-30T02:00:00.000Z\",\"executionEndTime\":\"2020-04-30T21:00:00.000Z\",\"waitForResults\":true,\"parameters\":{\"urgency\":\"MEDIUM\",\"targetBenchmark\":\"CLOSE\",\"imbalance\":0.9,\"participationRate\":0.1}}"));
        requestPost.setHeader("Content-Type", "application/json");
        requestPost.setHeader("Accept", "application/json");
        String response = EntityUtils.toString(httpClient.execute(requestPost).getEntity());


        //Find a way to get actual optimal execution time from API instead of just an ID to show to user
        //Ideal format: "... the best execution time is DATE/Time"
        System.out.println(" can be found response by using the following Marquee unique identifier " + response);
    }




}
