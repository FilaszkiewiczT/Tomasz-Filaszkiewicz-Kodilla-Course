package com.kodilla.stream.world;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Continent europe = new Continent();
        Continent africa = new Continent();
        europe.addCountry(new Country("Germany", new BigDecimal("20000000")));
        europe.addCountry(new Country("Poland", new BigDecimal("10000000")));
        europe.addCountry(new Country("France", new BigDecimal("30000000")));
        africa.addCountry(new Country("Libya", new BigDecimal("15000000")));
        africa.addCountry(new Country("Algeria", new BigDecimal("20000000")));
        africa.addCountry(new Country("Egypt", new BigDecimal("15000000")));
        //When
        World world = new World();
        world.addContinents(europe);
        world.addContinents(africa);
        //Then
        BigDecimal bigDecimal = new BigDecimal("110000000");
        assertEquals(world.getPeopleQuantity(), bigDecimal);
    }
}
