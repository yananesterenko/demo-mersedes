package com.example.demo.responce;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "startTimestamp",
        "endTimestamp",
        "positionLat",
        "positionLong"
})
public class Break {

    @JsonProperty("startTimestamp")
    private Integer startTimestamp;
    @JsonProperty("endTimestamp")
    private Integer endTimestamp;
    @JsonProperty("positionLat")
    private float positionLat;
    @JsonProperty("positionLong")
    private float positionLong;


    @JsonProperty("startTimestamp")
    public Integer getStartTimestamp() {
        return startTimestamp;
    }

    @JsonProperty("startTimestamp")
    public void setStartTimestamp(Integer startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    @JsonProperty("endTimestamp")
    public Integer getEndTimestamp() {
        return endTimestamp;
    }

    @JsonProperty("endTimestamp")
    public void setEndTimestamp(Integer endTimestamp) {
        this.endTimestamp = endTimestamp;
    }

    @JsonProperty("positionLat")
    public float getPositionLat() {
        return positionLat;
    }

    @JsonProperty("positionLat")
    public void setPositionLat(Integer positionLat) {
        this.positionLat = positionLat;
    }

    @JsonProperty("positionLong")
    public float getPositionLong() {
        return positionLong;
    }

    @JsonProperty("positionLong")
    public void setPositionLong(Integer positionLong) {
        this.positionLong = positionLong;
    }


}