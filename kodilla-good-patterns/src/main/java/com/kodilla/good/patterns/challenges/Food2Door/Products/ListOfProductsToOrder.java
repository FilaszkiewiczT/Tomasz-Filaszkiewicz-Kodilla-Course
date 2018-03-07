package com.kodilla.good.patterns.challenges.Food2Door.Products;

import java.util.ArrayList;
import java.util.List;

public class ListOfProductsToOrder {

    private List<Product> orderList = new ArrayList<>();

    public List<Product> addProductsToOrderList(Product product){
        orderList.add(product);
        return orderList;
    }
}
