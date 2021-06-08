package com.example.demo.dao;

import com.example.demo.model.WeatherModel;

public interface WeatherDao {

    WeatherModel getDetailsByCity(String city);
}
