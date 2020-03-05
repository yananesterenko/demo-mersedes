package com.example.demo.api;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class NeutrinoAPI {

    public String getRecodeReverceCityName(String latitude, String longitude) {
        String cityName = "No name";
        try {
//        HttpPost httpPost = new HttpPost("https://neutrinoapi.net/ip-info");
            HttpPost httpPost = new HttpPost("https://neutrinoapi.net/geocode-reverse");
            List<NameValuePair> postData = new ArrayList<>();
            postData.add(new BasicNameValuePair("user-id", "nesterenko"));
            postData.add(new BasicNameValuePair("api-key", "Fs407cGmB0wBXgNiAVzLqHJEeuCdv6TMsbe18tFsQJgvaHza"));
            postData.add(new BasicNameValuePair("latitude", latitude));
            postData.add(new BasicNameValuePair("longitude", longitude));
            postData.add(new BasicNameValuePair("language-code", "de"));
            httpPost.setEntity(new UrlEncodedFormEntity(postData, "UTF-8"));

            HttpResponse response = HttpClients.createDefault().execute(httpPost);
            String jsonStr = EntityUtils.toString(response.getEntity());

            JSONObject json = null;
            json = new JSONObject(jsonStr);
            System.out.println(json.toString());
            cityName = json.getString("city");
            System.out.println("City: " + json.getString("city"));
            System.out.println("Country: " + json.getString("country"));

        } catch (IOException | JSONException ex) {
            ex.printStackTrace();
        }

        return cityName;
    }


}
