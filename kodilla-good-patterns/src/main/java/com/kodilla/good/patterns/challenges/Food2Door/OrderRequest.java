package com.kodilla.good.patterns.challenges.Food2Door;

import com.kodilla.good.patterns.challenges.Food2Door.Customers.Customer;
import com.kodilla.good.patterns.challenges.Food2Door.Products.ListOfProductsToOrder;
import com.kodilla.good.patterns.challenges.Food2Door.Products.Product;
import com.kodilla.good.patterns.challenges.Food2Door.Shops.ExtraFoodShop;

public class OrderRequest {

    public Order retrieve() {
        Customer customer1 = new Customer("Adam Kowalski", "00-00 Katowice");
        ListOfProductsToOrder orderList1 = new ListOfProductsToOrder();
        orderList1.addProductsToOrderList(new Product("Masło", 5.0));
        orderList1.addProductsToOrderList(new Product("Cukier", 2.5));
        orderList1.addProductsToOrderList(new Product("Mleko", 2.5));
        orderList1.addProductsToOrderList(new Product("Kakao", 15.5));
        orderList1.addProductsToOrderList(new Product("Jogurt", 1.5));

        Order order1 = new Order(customer1, orderList1, new ExtraFoodShop());

        return order1;
    }
}
