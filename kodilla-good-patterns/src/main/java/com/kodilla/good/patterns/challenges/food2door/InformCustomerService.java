package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.customers.Customer;

public class InformCustomerService {

    public void firstInformation(Customer customer) {
        System.out.println("Przyjęto do realizacji zamówienie klienta:" + customer);
    }
    public void secondInformation(String shopName) {
        System.out.println("Sklep: " + shopName + " przyjął zamówienie. Wkrótce dostawa");
    }
    public void thirdInformation() {
        System.out.println("Niestety zamówienie nie zostanie zrealizowane");
    }

}
