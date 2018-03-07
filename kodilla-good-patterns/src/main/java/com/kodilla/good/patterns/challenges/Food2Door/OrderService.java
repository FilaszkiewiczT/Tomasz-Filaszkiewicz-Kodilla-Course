package com.kodilla.good.patterns.challenges.Food2Door;

import com.kodilla.good.patterns.challenges.Food2Door.Shops.Shops;

public class OrderService {

    public boolean orderService(Shops shops) {
       return shops.process();
    }
}
