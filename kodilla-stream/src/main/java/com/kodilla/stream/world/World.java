package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

    private List<Continent> world = new ArrayList<>();

    public void addContinents(Continent continent) {
        world.add(continent);
    }

    public List<Continent> getWorld() {
        return world;
    }

    public BigDecimal getPeopleQuantity() {
        return world.stream()
                .flatMap(continent -> continent.getContinent().stream())
                .map(country -> country.getNumberOfPeople())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));


    }
}
