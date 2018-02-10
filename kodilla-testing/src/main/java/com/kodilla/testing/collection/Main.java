package com.kodilla.testing.collection;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> list1 = new ArrayList<>();
        for (int n = 1; n <= 10; n++) {
            list1.add(n);
        }
        ArrayList<Integer> newList = oddNumbersExterminator.exterminate((ArrayList<Integer>) list1);

        System.out.println(newList);

    }
}
