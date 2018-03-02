package com.kodilla.good.patterns.challenges.ProductOrderService;

public class OrderService {
    public boolean createOrder(User user, Item item) {
        System.out.println("Przekazano do realizacji zamówienie użytkownika: " + user + "; Przedmiot zamówienia: " + item);
        return true;
    }
}
