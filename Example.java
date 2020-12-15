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


import java.util.ArrayList;
import java.util.List;


public class Example {
    public static void main(String args[]) throws java.io.IOException
    {
        HttpClient httpClient = HttpClientBuilder.create().build();
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

//
//        HttpPost authPost = new HttpPost("https://idfs.gs.com/as/token.oauth2");
//        List<NameValuePair> authParams = new ArrayList<>();
//        authParams.add(new BasicNameValuePair("grant_type", "client_credentials"));
//        authParams.add(new BasicNameValuePair("client_id", "db21815ca4694a7ea4fb01088c67c76a"));
//        authParams.add(new BasicNameValuePair("client_secret", "bc03aad2f387f24885e4f153f613bca01cdee70f313266723948e95f1417cb22"));


//
//        authPost.setEntity(new UrlEncodedFormEntity(authParams, Consts.UTF_8));
//        //String accessToken = new JsonParser().parse(EntityUtils.toString(httpClient.execute(authPost).getEntity())).getAsJsonObject().getAsJsonPrimitive("access_token").getAsString();
//        HttpGet requestGet = new HttpGet("https://api.marquee.gs.com/v1/risk/execution/pretrade/MA4B66MW5E27UANEQ29/results");
//        requestGet.setHeader("Authorization", "Bearer " + accessToken);
//        String response = EntityUtils.toString(httpClient.execute(requestGet).getEntity());
//        JSONObject json = new JSONObject(response); // Convert text to object
//        System.out.println(json.toString(4)); // Print it with specified indentation


//        String body = "ticker=AA&exchange=NYSE&asOfTime=2017-02-28T16:29:00Z";
//        String res1= Request.Get(PATH+ "/v1/assets/data")
//                .bodyString(body,ContentType.APPLICATION_JSON)
//                .addHeader("Authorization", "Bearer " + accessToken)
//                .addHeader("Content-Type", "application/json")
//                .execute().returnContent().asString();
//        JSONObject json = new JSONObject(res1); // Convert text to object
//        System.out.println(json.toString(4)); // Print it with specified indentation


//        Request request = Request.Get("https://api.marquee.gs.com/v1/assets/data");
//        String body = "ticker=AA&exchange=NYSE&asOfTime=2017-02-28T16:29:00Z";
//        request.bodyString(body,ContentType.APPLICATION_JSON);
//        request.addHeader("Authorization", "Bearer 0012gfIotRIOImkZ5k1Df4qK07KE");
//        request.addHeader("Content-Type", "application/json");
//        HttpResponse httpResponse = request.execute().returnResponse();
//        System.out.println(httpResponse.getStatusLine());
//        if (httpResponse.getEntity() != null) {
//            String html = EntityUtils.toString(httpResponse.getEntity());
//            System.out.println(html);
//        }


//        authPost.setEntity(new UrlEncodedFormEntity(authParams, Consts.UTF_8));
//        accessToken = new JsonParser().parse(EntityUtils.toString(httpClient.execute(authPost).getEntity())).getAsJsonObject().getAsJsonPrimitive("access_token").getAsString();
        HttpPost requestPost = new HttpPost("https://api.marquee.gs.com/v1/risk/execution/pretrade");
        requestPost.setHeader("Authorization", "Bearer " + accessToken);
        requestPost.setEntity(new StringEntity("{\"type\": \"APEX\",\"positions\":[{\"assetId\":\"MA4B66MW5E27UANEQ29\"," +
                "\"quantity\":-31927},{\"assetId\":\"MA4B66MW5E27U9XPVA7\",\"quantity\":469}]," +
                "\"executionStartTime\":\"2020-04-30T02:00:00.000Z\",\"executionEndTime\":\"2020-04-30T21:00:00.000Z\"," +
                "\"waitForResults\":false,\"parameters\":{\"urgency\":\"MEDIUM\"," +
                "\"targetBenchmark\":\"CLOSE\",\"imbalance\":0.9,\"participationRate\":0.1}}"));
        requestPost.setHeader("Content-Type", "application/json");
        requestPost.setHeader("Accept", "application/json");
        String response = EntityUtils.toString(httpClient.execute(requestPost).getEntity());
        JSONObject json = new JSONObject(response); // Convert text to object
        System.out.println(json.toString(4)); // Print it with specified indentation

        HttpGet requestGet = new HttpGet("https://api.marquee.gs.com/v1/portfolios");
        requestGet.setHeader("Authorization", "Bearer " + accessToken);
        String res2 = EntityUtils.toString(httpClient.execute(requestGet).getEntity());
        json = new JSONObject(res2); // Convert text to object
        System.out.println(json.toString(4)); // Print it with specified indentation

    }
}