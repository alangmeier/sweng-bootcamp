package com.github.langmeie.bootcamp.location;

import android.content.Context;
import android.location.Criteria;
import android.location.LocationManager;

public final class AndroidLocationService implements LocationService {
    private final LocationManager locationManager;
    private final String locationProvider;
    private final Criteria locationCriteria;

    AndroidLocationService(LocationManager locationManager, String locationProvider, Criteria locationCriteria) {
        this.locationManager = locationManager;
        this.locationProvider = locationProvider;
        this.locationCriteria = locationCriteria;
    }

    public static LocationManager buildManagerFromcontext(Context context) {
        return (LocationManager) context.getSystemService(Context.LOCATION_SERVICE);
    }
    public static LocationService buildFromContextAndProvider(Context context, String provider) {
        return new AndroidLocationService(buildManagerFromcontext(context), provider, null);
    }
    public static LocationService buildFromContextAndCriteria(Context context, Criteria criteria) {
        return new AndroidLocationService(buildManagerFromcontext(context), null, criteria);
    }

    private String getLocationProvider() {
        if (this.locationProvider != null) {
            return this.locationProvider;
        }

        return this.locationManager.getBestProvider(this.locationCriteria, true);
    }

    @Override
    public Location getCurrentLocation() {
        try {
            android.location.Location loc = this.locationManager.getLastKnownLocation(getLocationProvider());

            if (loc == null) return null;

            return new Location(loc.getLatitude(), loc.getLongitude());
        } catch (SecurityException ex) {
            throw ex;
        }
    }

}
