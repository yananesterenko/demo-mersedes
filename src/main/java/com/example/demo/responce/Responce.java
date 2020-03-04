package com.example.demo.responce;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "vin",
        "departure",
        "destination",
        "refuelStops",
        "consumption",
        "breaks"
})
public class Responce {

    @JsonProperty("vin")
    private String vin;
    @JsonProperty("departure")
    private String departure;
    @JsonProperty("destination")
    private String destination;
    @JsonProperty("refuelStops")
    private List<Break> refuelStops = null;
    @JsonProperty("consumption")
    private String consumption;
    @JsonProperty("breaks")
    private List<Break> breaks = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("vin")
    public String getVin() {
        return vin;
    }

    @JsonProperty("vin")
    public void setVin(String vin) {
        this.vin = vin;
    }

    @JsonProperty("departure")
    public String getDeparture() {
        return departure;
    }

    @JsonProperty("departure")
    public void setDeparture(String departure) {
        this.departure = departure;
    }

    @JsonProperty("destination")
    public String getDestination() {
        return destination;
    }

    @JsonProperty("destination")
    public void setDestination(String destination) {
        this.destination = destination;
    }

    @JsonProperty("refuelStops")
    public List<Break> getRefuelStops() {
        return refuelStops;
    }

    @JsonProperty("refuelStops")
    public void setRefuelStops(List<Break> refuelStops) {
        this.refuelStops = refuelStops;
    }

    @JsonProperty("consumption")
    public String getConsumption() {
        return consumption;
    }

    @JsonProperty("consumption")
    public void setConsumption(String consumption) {
        this.consumption = consumption;
    }

    @JsonProperty("breaks")
    public List<Break> getBreaks() {
        return breaks;
    }

    @JsonProperty("breaks")
    public void setBreaks(List<Break> breaks) {
        this.breaks = breaks;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}