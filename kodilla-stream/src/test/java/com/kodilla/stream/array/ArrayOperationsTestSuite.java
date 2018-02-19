package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = IntStream.rangeClosed(1,10).toArray();

        //When
        double average = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(5.5, average,0.0);
    }
}
