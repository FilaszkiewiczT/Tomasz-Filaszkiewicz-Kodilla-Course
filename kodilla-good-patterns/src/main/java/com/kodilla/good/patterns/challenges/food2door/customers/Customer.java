package com.kodilla.good.patterns.challenges.food2door.customers;

public class Customer {
    final private String name;
    final private String address;

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return name + ", adres dostawy: " + address;
    }
}

