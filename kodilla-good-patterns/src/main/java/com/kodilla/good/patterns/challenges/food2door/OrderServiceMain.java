package com.kodilla.good.patterns.challenges.food2door;



public class OrderServiceMain {

    public static void main (String [] args){
        OrderProcessor orderProcessor = new OrderProcessor(new InformCustomerService(), new OrderService());
        orderProcessor.processor(new OrderRequest());
    }



}
