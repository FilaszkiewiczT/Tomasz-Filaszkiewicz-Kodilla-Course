package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll("no sezam")
                .burgers(2)
                .sause("standard")
                .ingredients("chilli")
                .ingredients("salad")
                .ingredients("cheese")
                .build();
        System.out.println(bigmac);
        //When
        int amountOfIngredients = bigmac.getIngredients().size();
        String rollType = bigmac.getRoll();
        int numberOfBurgers = bigmac.getBurgers();
        String sauseType = bigmac.getSause();
        //Then
        Assert.assertNotNull(bigmac);
        Assert.assertEquals(amountOfIngredients, 3);
        Assert.assertEquals(rollType, "no sezam");
        Assert.assertEquals(numberOfBurgers, 2);
        Assert.assertEquals(sauseType, "standard");
    }
}
