package com.example.demo.service;

import com.example.demo.api.NeutrinoAPI;
import com.example.demo.responce.Responce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RequestService {

    @Autowired
    NeutrinoAPI neutrinoAPI;

    public Responce getResponse(String latitude, String longitude){
        Responce responce = new Responce();
        responce.setConsumption("Cons");
        responce.setVin("4234832486496");
        if (!latitude.isEmpty() & !longitude.isEmpty()) {
            responce.setDeparture(neutrinoAPI.getRecodeReverceCityName(latitude, longitude));
        } else {
            responce.setDeparture("No name");
        }
            responce.setDestination("Muenchen");

        return responce;
    }
}
