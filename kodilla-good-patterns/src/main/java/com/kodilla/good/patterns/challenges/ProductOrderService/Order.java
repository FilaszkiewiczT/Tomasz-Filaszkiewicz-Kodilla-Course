package com.kodilla.good.patterns.challenges.ProductOrderService;

public class Order {
    private final User user;
    private final Item item;
    private final boolean isOrdered;

    public Order(User user, Item item, boolean isOrdered) {
        this.user = user;
        this.item = item;
        this.isOrdered = isOrdered;
    }
}
