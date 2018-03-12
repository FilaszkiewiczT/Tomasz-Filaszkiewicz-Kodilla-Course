package com.kodilla.good.patterns.challenges.flights;

import java.util.List;
import java.util.stream.Collectors;

public class FlightFindProcessor {
    private final FlightsData flightsData;

    public FlightFindProcessor(FlightsData flightsData) {
        this.flightsData = flightsData;
    }

    public void fingFlightTo(String arrivalCity) {
        List<String> possibleFlights = flightsData.getFlights().stream()
                .filter(a -> a.getArrivalCity().equals(arrivalCity))
                .map(d -> d.getDepartureCity())
                .collect(Collectors.toList());
        if (possibleFlights.isEmpty()) {
            System.out.println("Brak lotów do: " + arrivalCity);
        } else {
            System.out.println("Loty do: " + arrivalCity + " są dostępne z nast. miast:\n" + possibleFlights);
        }
    }

    public void findFlightFrom(String departureCity) {
        List<String> possibleFlights = flightsData.getFlights().stream()
                .filter(d -> d.getDepartureCity().equals(departureCity))
                .map(a -> a.getArrivalCity())
                .collect(Collectors.toList());
        if (possibleFlights.isEmpty()) {
            System.out.println("Brak lotów z: " + departureCity);
        } else {
            System.out.println("Z " + departureCity + " można lecieć do:\n" + possibleFlights);
        }
    }

    public void findFlightThrough(String arrivalCity, String throughCity, String departureCity) {
        long fromDtoT = flightsData.getFlights().stream()
                .filter(d -> d.getDepartureCity().equals(departureCity))
                .filter(t -> t.getArrivalCity().equals(throughCity))
                .count();
        long fromTtoA = flightsData.getFlights().stream()
                .filter(d -> d.getDepartureCity().equals(throughCity))
                .filter(a -> a.getArrivalCity().equals(arrivalCity))
                .count();

        if (fromDtoT > 0 && fromTtoA > 0) {
            System.out.println("Z " + departureCity + " można lecieć do:" + arrivalCity + " przez " + throughCity);
        } else {
            System.out.println("Brak lotów z: " + departureCity + " do " + arrivalCity + " przez " + throughCity);
        }

    }


}
