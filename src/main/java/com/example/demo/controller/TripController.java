package com.example.demo.controller;


import com.example.demo.request.DataRequest;
import com.example.demo.request.Request;
import com.example.demo.responce.Responce;
import com.example.demo.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping
public class TripController {

    @Autowired
    private RequestService requestService;

    @GetMapping("/")
    public String getInfo(){
        return "Home page";
    }

    @PostMapping("/trip")
    @ResponseStatus(HttpStatus.OK)
    public Responce createResponce(@Valid @RequestBody Request request) {
        List<DataRequest> listData = request.getData();
        DataRequest elem = listData.get(0);
        Responce responce = requestService.getResponse(elem.getPositionLat(), elem.getPositionLong());
        return responce;
    }


}


