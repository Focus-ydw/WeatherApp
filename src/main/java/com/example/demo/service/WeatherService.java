package com.example.demo.service;

import com.example.demo.model.WeatherModel;

public interface WeatherService {

    WeatherModel getDetailsByCity(String city);
}
