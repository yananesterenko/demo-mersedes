package com.example.demo.controller;


import com.example.demo.request.DataRequest;
import com.example.demo.request.Request;
import com.example.demo.responce.Responce;
import com.example.demo.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/trip")
public class TripController {

    @Autowired
    RequestService requestService;

    @PostMapping

    public Responce createResponce(@Valid @RequestBody Request request) {
        List<DataRequest> listData = request.getData();
        DataRequest elem = listData.get(0);
        Responce responce = requestService.getResponse(elem.getPositionLat(), elem.getPositionLong());

//        Responce responce = requestService.getResponse(latitude, longitude);
//        listResponce.add(responce)
        // responce.setConsumption("test");
        return responce;
    }

}


