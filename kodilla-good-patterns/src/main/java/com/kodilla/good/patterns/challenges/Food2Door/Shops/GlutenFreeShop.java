package com.kodilla.good.patterns.challenges.Food2Door.Shops;

public class GlutenFreeShop implements Shops {
    @Override
    public boolean process() {
        System.out.println("Przyjęto do realizacji");
        return true;
    }

    @Override
    public String getShopName(){
        return "GlutenFreeShop";
    }
}
