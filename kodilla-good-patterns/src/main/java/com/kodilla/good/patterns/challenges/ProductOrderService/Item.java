package com.kodilla.good.patterns.challenges.ProductOrderService;

public class Item {
    private String ItemName;
    private double price;

    public Item(String itemName, double price) {
        ItemName = itemName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "ItemName='" + ItemName + '\'' +
                ", price=" + price +
                '}';
    }
}
