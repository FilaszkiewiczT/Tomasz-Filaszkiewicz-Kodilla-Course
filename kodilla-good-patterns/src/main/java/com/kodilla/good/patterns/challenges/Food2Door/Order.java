package com.kodilla.good.patterns.challenges.Food2Door;

import com.kodilla.good.patterns.challenges.Food2Door.Customers.Customer;
import com.kodilla.good.patterns.challenges.Food2Door.Products.ListOfProductsToOrder;
import com.kodilla.good.patterns.challenges.Food2Door.Shops.Shops;

public class Order {
    private final Customer customer;
    private final ListOfProductsToOrder listOfProductsToOrder;
    private Shops shops;

    public Order(Customer customer, ListOfProductsToOrder listOfProductsToOrder, Shops shops) {
        this.customer = customer;
        this.listOfProductsToOrder = listOfProductsToOrder;
        this.shops = shops;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Shops getShop() {
        return shops;
    }

    public ListOfProductsToOrder getListOfProductsToOrder() {
        return listOfProductsToOrder;
    }
}
