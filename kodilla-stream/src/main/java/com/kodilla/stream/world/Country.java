package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {

    private String name;
    private BigDecimal numberOfPeople;

    public Country(String name, BigDecimal numberOfPeople) {
        this.name = name;
        this.numberOfPeople = numberOfPeople;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getNumberOfPeople() {
        return numberOfPeople;
    }
}
