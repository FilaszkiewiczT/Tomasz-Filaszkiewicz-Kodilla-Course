package com.kodilla.good.patterns.challenges.flights;

import java.util.Objects;

public class Flight {
    final String arrivalCity;
    final String departureCity;

    public Flight(final String arrivalCity,final String departureCity) {
        this.arrivalCity = arrivalCity;
        this.departureCity = departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        return Objects.equals(arrivalCity, flight.arrivalCity) &&
                Objects.equals(departureCity, flight.departureCity);
    }

    @Override
    public int hashCode() {

        return Objects.hash(arrivalCity, departureCity);
    }
}
