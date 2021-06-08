package com.example.demo.model;

import java.sql.Timestamp;

public class WeatherModel {

    private String city;

    private Timestamp updateTime;

    private String weatherDes;

    private String temperature;

    private String wind;

    private WeatherModel() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public String getWeatherDes() {
        return weatherDes;
    }

    public void setWeatherDes(String weatherDes) {
        this.weatherDes = weatherDes;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getWind() {
        return wind;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }

    public static WeatherModel builder() {
        return new WeatherModel();
    }

    public WeatherModel city(String city) {
        this.setCity(city);
        return this;
    }

    public WeatherModel updateTime(Timestamp updateTime) {
        this.setUpdateTime(updateTime);
        return this;
    }

    public WeatherModel weatherDes(String weatherDes) {
        this.setWeatherDes(weatherDes);
        return this;
    }

    public WeatherModel temperature(String temperature) {
        this.setTemperature(temperature);
        return this;
    }

    public WeatherModel wind(String wind) {
        this.setWind(wind);
        return this;
    }
}
