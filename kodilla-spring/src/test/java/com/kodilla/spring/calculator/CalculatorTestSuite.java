package com.kodilla.spring.calculator;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double sum = calculator.add(2.1, 3.2);
        double sub = calculator.sub(4.3, 1.1);
        double mul = calculator.mul(2.2, 3.1);
        double div = calculator.div(6.5, 2.5);
        //Then
        Assert.assertEquals(sum, 5.3, 0.1);
        Assert.assertEquals(sub, 3.2, 0.1);
        Assert.assertEquals(mul, 6.8, 0.1);
        Assert.assertEquals(div, 2.6, 0.1);
    }

}
