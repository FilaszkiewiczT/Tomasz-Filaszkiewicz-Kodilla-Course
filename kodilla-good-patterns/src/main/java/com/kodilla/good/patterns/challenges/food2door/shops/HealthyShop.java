package com.kodilla.good.patterns.challenges.food2door.shops;

public class HealthyShop implements Shops {
    @Override
    public boolean process() {
        System.out.println("Przyjęto do realizacji");
        return true;
    }

    @Override
    public String getShopName(){
        return "HealthyShop";
    }
}
