package com.kodilla.good.patterns.challenges.food2door.shops;

public class ExtraFoodShop implements Shops {

    private final static String SHOP_NAME = "ExtraFoodShop";
    @Override
    public boolean process() {
        System.out.println(SHOP_NAME + ", przetwarza zamówienie");
        return true;
    }

    @Override
    public String getShopName(){
        return "ExtraFoodShop";
    }
}
