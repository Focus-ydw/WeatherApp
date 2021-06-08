package com.example.demo.controller;

import com.example.demo.model.WeatherModel;
import com.example.demo.service.WeatherService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/weather")
    @ResponseBody
    public ResponseEntity<WeatherModel> getWeatherByCity(@RequestParam String city) throws Exception {
        return ResponseEntity.ok(weatherService.getDetailsByCity(city));
    }
}
