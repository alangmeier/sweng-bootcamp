package com.github.langmeie.bootcamp.geocoding;

import androidx.annotation.NonNull;

import java.io.IOException;

import com.github.langmeie.bootcamp.location.Location;

/*
This interface allows to get a Location from a String address (e.g. city, country, street, ...)
or to get an Address from a Location.
 */

public interface GeocodingService {
    /*
    Gets a location from a textual address

    @param address as a String
    @return Location
    @throws IOException if any network error
     */
    Location getLocation(@NonNull String address) throws IOException;

    /*
    Gets the address corresponding to a location

    @param Location
    @return Address
    @throws IOException if any network error
     */
    Address getAddress(@NonNull Location location) throws IOException;
}
