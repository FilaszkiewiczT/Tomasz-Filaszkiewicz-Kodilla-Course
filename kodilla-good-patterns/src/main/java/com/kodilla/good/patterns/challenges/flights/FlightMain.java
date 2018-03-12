package com.kodilla.good.patterns.challenges.flights;

public class FlightMain {
    public static void main(String[] args) {
        FlightsData flightsData = new FlightsData();
        FlightFindProcessor flightFindProcessor = new FlightFindProcessor(flightsData);

        flightFindProcessor.fingFlightTo("Gdańsk");
        flightFindProcessor.findFlightFrom("Katowice");
        flightFindProcessor.findFlightThrough("Gdańsk", "Warszawa", "Katowice");
        flightFindProcessor.findFlightThrough("Gdańsk", "Radom", "Katowice");
    }
}
