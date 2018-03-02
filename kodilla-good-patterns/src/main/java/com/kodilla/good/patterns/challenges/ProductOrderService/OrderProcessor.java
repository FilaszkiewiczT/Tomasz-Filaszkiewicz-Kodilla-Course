package com.kodilla.good.patterns.challenges.ProductOrderService;

public class OrderProcessor {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(InformationService informationService, OrderService orderService, OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public Order process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.createOrder(orderRequest.getUser(), orderRequest.getItem());

        if (isOrdered) {
            informationService.informUser(orderRequest.getUser());
            orderRepository.addOrder(orderRequest.getUser(), orderRequest.getItem());
            return new Order(orderRequest.getUser(), orderRequest.getItem(), true);
        } else {
            return new Order(orderRequest.getUser(),orderRequest.getItem(), false);
        }
    }
}