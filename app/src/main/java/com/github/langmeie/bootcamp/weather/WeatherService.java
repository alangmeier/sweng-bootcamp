package com.github.langmeie.bootcamp.weather;

import java.io.IOException;

import com.github.langmeie.bootcamp.location.Location;

/*
This interface represents a service that allows to get weather forecasts for a specific location
 */

import java.io.IOException;

public interface WeatherService {
    /*
    Get the weather forecast at a specific Location

    @param Location for the location of the desired forecast
    @return WeatherForecast the weather forecast for three days (including today)
    @throws IOException if any network error
     */
    WeatherForecast getForecast(Location location) throws IOException;
}
