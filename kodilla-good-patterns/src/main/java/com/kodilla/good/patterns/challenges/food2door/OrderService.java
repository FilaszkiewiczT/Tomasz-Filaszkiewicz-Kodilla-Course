package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.shops.Shops;

public class OrderService {

    public boolean orderService(Shops shops) {
       return shops.process();
    }
}
