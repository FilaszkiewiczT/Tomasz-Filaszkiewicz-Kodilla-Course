package com.kodilla.stream.world;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Continent continent1 = new Continent();
        Continent continent2 = new Continent();
        continent1.addCountry(new Country("Country1", new BigDecimal("20000000")));
        continent1.addCountry(new Country("Country2", new BigDecimal("10000000")));
        continent1.addCountry(new Country("Country3", new BigDecimal("30000000")));
        continent2.addCountry(new Country("Country4", new BigDecimal("15000000")));
        continent2.addCountry(new Country("Country5", new BigDecimal("20000000")));
        continent2.addCountry(new Country("Country6", new BigDecimal("15000000")));
        //When
        World world = new World();
        world.addContinents(continent1);
        world.addContinents(continent2);
        //Then
        BigDecimal bigDecimal = new BigDecimal("110000000");
        assertEquals(world.getPeopleQuantity(), bigDecimal);
    }
}
