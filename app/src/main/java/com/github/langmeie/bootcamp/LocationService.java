package com.github.langmeie.bootcamp;

import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;

public class LocationService {
    public static LocationManager locationManager = new LocationManager();
    public static Location location = new Location(locationManager.getBestProvider(new Criteria()));

    public void getCurrentLocation() {
        LocationManager.getLastKnownLocation(LocationManager.getBestProvider(new Criteria()));
    }
}
