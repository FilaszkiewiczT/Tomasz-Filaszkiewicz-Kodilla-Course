package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.customers.Customer;
import com.kodilla.good.patterns.challenges.food2door.products.ListOfProductsToOrder;
import com.kodilla.good.patterns.challenges.food2door.products.Product;
import com.kodilla.good.patterns.challenges.food2door.shops.ExtraFoodShop;

public class OrderRetriever {
    public OrderRequest retrieve() {

        Customer customer1 = new Customer("Adam Kowalski", "00-00 Katowice");
        ListOfProductsToOrder orderList = new ListOfProductsToOrder();
        orderList.addProductsToOrderList(new Product("Masło", 5.0));
        orderList.addProductsToOrderList(new Product("Cukier", 2.5));
        orderList.addProductsToOrderList(new Product("Mleko", 2.5));
        orderList.addProductsToOrderList(new Product("Kakao", 15.5));
        orderList.addProductsToOrderList(new Product("Jogurt", 1.5));

        Order order = new Order(customer1, orderList, new ExtraFoodShop());
        return new OrderRequest(order);
    }
}
