package org.example.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Main {
    private double temp;

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(double feelsLike) {
        this.feelsLike = feelsLike;
    }

    @JsonProperty("feels_like")
    private double feelsLike;
}
