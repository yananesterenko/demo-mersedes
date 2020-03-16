package com.example.demo.service;

import com.example.demo.api.NeutrinoAPI;
import com.example.demo.responce.Responce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RequestService {

    @Autowired
    private NeutrinoAPI neutrinoAPI;


    RestTemplate restTemplate;

    public Responce getResponse(String latitude, String longitude) {
        Responce responce = new Responce();
        responce.setConsumption("Cons");
        responce.setVin("4234832486496");
        responce.setAdditionalProperty("AddProperty", "Value property");
        if (!latitude.isEmpty() && !longitude.isEmpty()) {
            responce.setDeparture(neutrinoAPI.getRecodeReverceCityName(latitude, longitude));
        } else {
            responce.setDeparture("No name");
        }
        responce.setDestination("Muenchen");
        return responce;
    }


}
