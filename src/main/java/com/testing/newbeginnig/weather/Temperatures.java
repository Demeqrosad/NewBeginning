package com.testing.newbeginnig.weather;

import java.util.HashMap;

public interface Temperatures {

    //first element of the map is an identifier of weather station
    //second element of the map is a temperature in Celsius degrees

    HashMap<Integer, Double> getTemperatures();
}

