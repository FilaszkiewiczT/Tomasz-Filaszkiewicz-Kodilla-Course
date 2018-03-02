package com.kodilla.good.patterns.challenges.ProductOrderService;

public class User {
    private final String name;
    private final String surname;
    private String address;

    public User(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
