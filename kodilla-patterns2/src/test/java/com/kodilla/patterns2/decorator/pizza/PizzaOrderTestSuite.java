package com.kodilla.patterns2.decorator.pizza;


import org.junit.Test;

import java.math.BigDecimal;
import static org.junit.Assert.*;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrder() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        BigDecimal calculatedCost = pizzaOrder.getCost();
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals(new BigDecimal(15), calculatedCost);
        assertEquals("Pizza with tomato sauce and cheese", description);
    }
    @Test
    public void testDecoratedPizzaOrder(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new MoreSaucePizzaDecorator(pizzaOrder);
        pizzaOrder = new FastDeliveryPizzaDecorator(pizzaOrder);
        //When
        BigDecimal calculatedCost = pizzaOrder.getCost();
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals(new BigDecimal(22), calculatedCost);
        assertEquals("Pizza with tomato sauce and cheese - add more sauce - set fast delivery", description);
    }

}
