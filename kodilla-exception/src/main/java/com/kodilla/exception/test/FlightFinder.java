package com.kodilla.exception.test;

import java.util.Map;

public class FlightFinder {
    public void findFilght(Flight flight) throws RouteNotFoundException {
        AirportsData airportsData = new AirportsData();
        Map<String, Boolean> airports = airportsData.airports();

        if (airports.containsKey(flight.getArrivalAirport())) {
            if (airports.get(flight.getArrivalAirport()) == true) {
                System.out.println(flight.toString());
            } else {
                throw new RouteNotFoundException("Landing not possible!!!");
            }
        }
    }
}