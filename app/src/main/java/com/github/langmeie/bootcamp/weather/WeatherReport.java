package com.github.langmeie.bootcamp.weather;

/*
This class represents a weather report.
 */

public class WeatherReport {
    public final double aveT;
    public final double minT;
    public final double maxT;

    public final String weatherType;
    public final String weatherIcon;

    public WeatherReport(double aveT, double minT, double maxT, String weatherType, String weatherIcon) {
        this.aveT = aveT;
        this.minT = minT;
        this.maxT = maxT;
        this.weatherType = weatherType;
        this.weatherIcon = weatherIcon;
    }


}
