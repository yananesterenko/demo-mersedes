package com.example.demo.api;

import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class NeutrinoAPI {
    private static Logger log = LoggerFactory.getLogger(NeutrinoAPI.class.getName());

    public String getRecodeReverceCityName(String latitude, String longitude) {
        String cityName = "No name";
        try {
            HttpPost httpPost = new HttpPost("https://neutrinoapi.net/geocode-reverse");
            List<NameValuePair> postData = new ArrayList<>();
            postData.add(new BasicNameValuePair("user-id", "nesterenko"));
            postData.add(new BasicNameValuePair("api-key", "Fs407cGmB0wBXgNiAVzLqHJEeuCdv6TMsbe18tFsQJgvaHza"));
            postData.add(new BasicNameValuePair("latitude", latitude));
            postData.add(new BasicNameValuePair("longitude", longitude));
            postData.add(new BasicNameValuePair("language-code", "de"));
            httpPost.setEntity(new UrlEncodedFormEntity(postData, "UTF-8"));
            try (CloseableHttpResponse response = HttpClients.createDefault().execute(httpPost)) {
                String jsonStr = EntityUtils.toString(response.getEntity());
                JSONObject json;
                json = new JSONObject(jsonStr);
                String message = json.toString();
                log.info(message);
                cityName = json.getString("city");
                String infoMessage = "City: " + json.getString("city");
                log.info(infoMessage);
            }
        } catch (Exception e) {
            log.error("Unexpected error", e);
        }
        return cityName;
    }


}
