package com.kodilla.good.patterns.challenges.ProductOrderService;

public class ProductOrderService {
    public static void main(String[] args) {

        OrderRetriever orderRetriever = new OrderRetriever();
        OrderRequest orderRequest = orderRetriever.retrieve();
        OrderProcessor orderProcessor = new OrderProcessor(new InformationService(), new OrderService(), new OrderRepository());

        orderProcessor.process(orderRequest);
    }
}
