package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> list1 = new ArrayList<>();
        for (int n = 1; n <= 10; n++) {
            list1.add(n);
        }
        List<Integer> newList = oddNumbersExterminator.exterminate(list1);

        System.out.println(newList);

    }
}
