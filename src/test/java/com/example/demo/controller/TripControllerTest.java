package com.example.demo.controller;

import com.example.demo.request.DataRequest;
import com.example.demo.request.Request;
import com.example.demo.responce.Responce;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.cxf.common.util.Base64Utility;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;


/*@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)*/
public class TripControllerTest {

    @Autowired
    private TripController tripController;

    @LocalServerPort
    int randomServerPort;

    @Autowired
    private TestRestTemplate restTemplate;

    private Request getMockRequest() {
        List<DataRequest> mockDataReques = new ArrayList<>();
        DataRequest dataRequest = new DataRequest();
        dataRequest.setFuelLevel(5);
        dataRequest.setOdometer("10");
        dataRequest.setPositionLat("48.771990");
        dataRequest.setPositionLong("9.172787");
        mockDataReques.add(dataRequest);
        Request mockRequest = new Request("4234832486496", "50", "50", mockDataReques);
        return mockRequest;
    }

   /* @Test
    public void givenRightRequest_AnswerRightResponse() {

        Request myRequest = getMockRequest();
        Responce responce = tripController.createResponce(myRequest);
        Assert.assertEquals("Stuttgart", responce.getDeparture());
    }*/


  /*  @Test
    public void postTest() throws URISyntaxException {
        final String baseUrl = "http://localhost:" + randomServerPort + "/trip/";
        URI uri = new URI(baseUrl);
        Request myRequest = getMockRequest();
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-COM-PERSIST", "true");
        String userAndPass = "admin:admin";
        headers.add("Authorization", "Basic " + Base64Utility.encode(userAndPass.getBytes()));
        HttpEntity<Request> request = new HttpEntity<>(myRequest, headers);
        ResponseEntity<String> result = this.restTemplate.postForEntity(uri, request, String.class);
        Assert.assertEquals(200, result.getStatusCodeValue());
    }*/


    public static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
