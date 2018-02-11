package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> list1 = new ArrayList<>();
        //When
        System.out.println("Testing List size: " + list1.size());
        List<Integer> newList = oddNumbersExterminator.exterminate(list1);
        //Then
        assertEquals(list1, newList);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> list1 = new ArrayList<>();
        for (int n = 1; n <= 10; n++) {
            list1.add(n);
        }
        for (int n = 0; n < list1.size(); n++) {
            if (list1.get(n) % 2 != 0) list1.remove(n);
        }
        //When
        System.out.println("Testing Normal List: " + list1);
        List<Integer> newList = oddNumbersExterminator.exterminate(list1);
        //Then
        assertEquals(list1, newList);
    }
}
