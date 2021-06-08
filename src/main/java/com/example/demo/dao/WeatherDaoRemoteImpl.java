package com.example.demo.dao;

import com.example.demo.constant.WeatherConstants;
import com.example.demo.model.WeatherModel;
import org.springframework.web.client.RestTemplate;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class WeatherDaoRemoteImpl implements WeatherDao {

    private final RestTemplate restTemplate;

    public WeatherDaoRemoteImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public WeatherModel getDetailsByCity(String city) {
        String url = WeatherConstants.API_URL.replace(WeatherConstants.API_URL_PARAM, city.toLowerCase());
        Map<String, String> details = restTemplate.getForObject(url, HashMap.class);
        return WeatherModel.builder()
                .city(city)
                .weatherDes(details.get("description"))
                .temperature(details.get("temperature"))
                .wind(details.get("wind"))
                .updateTime(new Timestamp(System.currentTimeMillis()));
    }
}
