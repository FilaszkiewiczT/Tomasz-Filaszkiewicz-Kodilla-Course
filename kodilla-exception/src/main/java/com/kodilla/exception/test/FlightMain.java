package com.kodilla.exception.test;

public class FlightMain {
    public static void main(String[] args) {
        Flight flight1 = new Flight("Berlin", "Katowice");
        Flight flight2 = new Flight("Berlin", "Gdańsk");

        FlightFinder flightFinder = new FlightFinder();

        try {
            flightFinder.findFilght(flight2);
        } catch (RouteNotFoundException e) {
            System.out.println("Error: " + e);
        }

    }
}
