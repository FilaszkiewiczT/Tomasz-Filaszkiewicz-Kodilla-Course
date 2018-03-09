package com.kodilla.good.patterns.challenges.flights;

import java.util.HashSet;
import java.util.Set;

public class FlightsData {
    final Set<Flight> flights = new HashSet<>();

    public FlightsData() {
        flights.add(new Flight("Warszawa", "Katowice"));
        flights.add(new Flight("Warszawa", "Kraków"));
        flights.add(new Flight("Warszawa", "Gdańsk"));
        flights.add(new Flight("Katowice", "Warszawa"));
        flights.add(new Flight("Katowice", "Kraków"));
        flights.add(new Flight("Katowice", "Radom"));
        flights.add(new Flight("Kraków", "Katowice"));
        flights.add(new Flight("Kraków", "Warszawa"));
        flights.add(new Flight("Gdańsk", "Warszawa"));
        flights.add(new Flight("Gdańsk", "Katowice"));
        flights.add(new Flight("Radom", "Katowice"));

    }

    public Set<Flight> getFlights() {
        return flights;
    }
}
