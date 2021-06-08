package com.example.demo.service;

import com.example.demo.dao.WeatherDao;
import com.example.demo.model.WeatherModel;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.util.ReflectionTestUtils;

import java.util.Collections;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;

public class WeatherServiceImplTest {

    private WeatherServiceImpl weatherService;

    @Mock
    private WeatherDao weatherDao;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        weatherService = new WeatherServiceImpl(weatherDao);
    }

    @Test
    public void shouldReturnNull_whenCityIsNull() {
        WeatherModel actual = weatherService.getDetailsByCity(null);
        assertNull(actual);
    }

    @Test
    public void shouldReturnValue_whenCityIsSydney() {
        ReflectionTestUtils.setField(weatherService, "includedCities", Collections.singletonList("Sydney"));

        WeatherModel expectation = WeatherModel.builder().city("Sydney");

        when(weatherDao.getDetailsByCity("Sydney")).thenReturn(expectation);

        WeatherModel actual = weatherService.getDetailsByCity("Sydney");

        assertNotNull(actual);
    }


    @Test(expected = IllegalArgumentException.class)
    public void shouldException_whenIncludedCitiesIsNull() {
        ReflectionTestUtils.setField(weatherService, "includedCities", Collections.emptyList());

        weatherService.getDetailsByCity("Sydney");
    }
}
