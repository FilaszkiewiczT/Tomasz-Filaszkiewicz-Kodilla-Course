package com.kodilla.good.patterns.challenges.ProductOrderService;

public class OrderRequest {
    private final User user;
    private final Item item;

    public OrderRequest(User user, Item item) {
        this.user = user;
        this.item = item;
    }

    public User getUser() {
        return user;
    }

    public Item getItem() {
        return item;
    }
}
