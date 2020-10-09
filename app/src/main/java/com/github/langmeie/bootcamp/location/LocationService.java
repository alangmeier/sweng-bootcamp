package com.github.langmeie.bootcamp.location;

/*
This service allows to get the current location of the user
 */

public interface LocationService {
    /*
    Finds the location of the user

    @return  the current Location of the user
     */
    Location getCurrentLocation();
}
