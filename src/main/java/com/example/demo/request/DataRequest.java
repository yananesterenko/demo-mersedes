package com.example.demo.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public class DataRequest {
    @JsonProperty("timestamp")
    private String timestamp;
    @JsonProperty("odometer")
    private String odometer;
    @JsonProperty("fuelLevel")
    @Min(0)
    @Max(100)
    private int fuelLevel;
    @JsonProperty("positionLat")
    private String positionLat;
    @JsonProperty("positionLong")
    private String positionLong;

    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("odometer")
    public String getOdometer() {
        return odometer;
    }

    @JsonProperty("odometer")
    public void setOdometer(String odometer) {
        this.odometer = odometer;
    }

    @JsonProperty("fuelLevel")

    public int getFuelLevel() {
        return fuelLevel;
    }

    @JsonProperty("fuelLevel")
    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    @JsonProperty("positionLat")
    public String getPositionLat() {
        return positionLat;
    }

    @JsonProperty("positionLat")
    public void setPositionLat(String positionLat) {
        this.positionLat = positionLat;
    }

    @JsonProperty("positionLong")
    public String getPositionLong() {
        return positionLong;
    }

    @JsonProperty("positionLong")
    public void setPositionLong(String positionLong) {
        this.positionLong = positionLong;
    }

}
