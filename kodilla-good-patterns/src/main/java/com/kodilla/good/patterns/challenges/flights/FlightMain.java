package com.kodilla.good.patterns.challenges.flights;

public class FlightMain {
    public static void main(String[] args) {
        FlightFindProcessor flightFindProcessor = new FlightFindProcessor();

        flightFindProcessor.fingFlightTo("Gdańsk");
        flightFindProcessor.findFlightFrom("Katowice");
        flightFindProcessor.findFlightThrough("Gdańsk", "Warszawa", "Katowice");
        flightFindProcessor.findFlightThrough("Gdańsk", "Radom", "Katowice");
    }
}
