package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.shops.Shops;

public class OrderRequest {

    private final Order order;
    private final Shops shops;

    public OrderRequest(Order order) {
        this.order = order;
        this.shops = order.getShop();
    }

    public Order getOrder() {
        return order;
    }

    public Shops getShops() {
        return shops;
    }
}
