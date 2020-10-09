package com.github.langmeie.bootcamp.weather;

import androidx.annotation.NonNull;

/*
This class represents the weather forecast for three days (today and the two coming days)
 */

public class WeatherForecast {
    private final WeatherReport[] reports;

    /*
    Instanciation of a forecast

    @param reports three weather reports, one per day
        reports[0] is today's forecast
        reports[1] is tomorrow's forecast and
        reports[2] is the report for the day after tomorrow
     */
    WeatherForecast(WeatherReport[] reports) {
        if (reports.length < 3) {
            throw new IllegalArgumentException("Reports array must contain at least 3 elements.");
        }

        this.reports = reports;
    }

    public enum Day {
        TODAY, TOMORROW, AFTER_TOMORROW;
    }

    public WeatherReport getWeatherReport(@NonNull Day offset) {
        return this.reports[offset.ordinal()];
    }
}
