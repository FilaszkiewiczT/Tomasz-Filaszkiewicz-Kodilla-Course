package com.kodilla.good.patterns.challenges.ProductOrderService;

public class OrderRepository {

    public void addOrder(User user, Item item) {
        System.out.println("Zapisano zamówienie użytkownika: " + user + "; Zamówiono: " + item);
    }
}
