package com.example.demo.request;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Request {
    @JsonProperty("vin")
    private String vin;
    @JsonProperty("breakThreshold")
    private String breakThreshold;
    @JsonProperty("gasTankSize")
    private String gasTankSize;
    @JsonProperty("data")
    private List<DataRequest> data = null;


    @JsonProperty("vin")
    public String getVin() {
        return vin;
    }

    @JsonProperty("vin")
    public void setVin(String vin) {
        this.vin = vin;
    }

    @JsonProperty("breakThreshold")
    public String getBreakThreshold() {
        return breakThreshold;
    }

    @JsonProperty("breakThreshold")
    public void setBreakThreshold(String breakThreshold) {
        this.breakThreshold = breakThreshold;
    }

    @JsonProperty("gasTankSize")
    public String getGasTankSize() {
        return gasTankSize;
    }

    @JsonProperty("gasTankSize")
    public void setGasTankSize(String gasTankSize) {
        this.gasTankSize = gasTankSize;
    }

    @JsonProperty("data")
    public List<DataRequest> getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(List<DataRequest> data) {
        this.data = data;
    }


}
