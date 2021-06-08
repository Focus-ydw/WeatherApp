package com.example.demo.service;

import com.example.demo.dao.WeatherDao;
import com.example.demo.model.WeatherModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.List;

public class WeatherServiceImpl implements WeatherService {

    @Value("${include_cities}")
    private List<String> includedCities;

    private final WeatherDao weatherDao;

    public WeatherServiceImpl(WeatherDao weatherDao) {
        this.weatherDao = weatherDao;
    }

    @Override
    public WeatherModel getDetailsByCity(String city) {
        if (StringUtils.isEmpty(city)) {
            return null;
        }
        if (CollectionUtils.isEmpty(includedCities) || includedCities.stream().noneMatch(item -> item.equalsIgnoreCase(city))) {
            throw new IllegalArgumentException("This city is not supported.");
        }
        return weatherDao.getDetailsByCity(city);
    }
}
