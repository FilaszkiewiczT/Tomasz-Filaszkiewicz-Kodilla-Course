package com.kodilla.good.patterns.challenges.ProductOrderService;

public class OrderRetriever {

    public OrderRequest retrieve() {
        User user = new User("Adam", "Kowalski", "00-000 Katowice, ul. Pierwsza 1");
        Item item = new Item("Szafa", 1200.00);

        return new OrderRequest(user, item);
    }
}
