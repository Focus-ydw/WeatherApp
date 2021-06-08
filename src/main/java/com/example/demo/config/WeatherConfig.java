package com.example.demo.config;

import com.example.demo.controller.WeatherController;
import com.example.demo.dao.WeatherDao;
import com.example.demo.dao.WeatherDaoRemoteImpl;
import com.example.demo.service.WeatherService;
import com.example.demo.service.WeatherServiceImpl;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class WeatherConfig {

    @Bean
    public RestTemplate restTemplate() {
        RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
        return restTemplateBuilder.build();
    }

    @Bean
    public WeatherDao weatherDao(RestTemplate restTemplate) {
        return new WeatherDaoRemoteImpl(restTemplate);
    }

    @Bean
    public WeatherService weatherService(WeatherDao weatherDao) {
        return new WeatherServiceImpl(weatherDao);
    }

//    @Bean
//    public WeatherController weatherController(WeatherService weatherService) {
//        return new WeatherController(weatherService);
//    }
}
