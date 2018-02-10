package com.kodilla.testing.collection;

import java.util.*;

import org.junit.*;
import com.kodilla.testing.collection.*;

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
        ArrayList<Integer> newList = oddNumbersExterminator.exterminate((ArrayList<Integer>) list1);
        //Then
        Assert.assertEquals(list1, newList);
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
        ArrayList<Integer> newList = oddNumbersExterminator.exterminate((ArrayList<Integer>) list1);
        //Then
        Assert.assertEquals(list1, newList);
    }
}
