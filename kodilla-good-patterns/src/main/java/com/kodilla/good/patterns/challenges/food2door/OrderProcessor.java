package com.kodilla.good.patterns.challenges.food2door;

public class OrderProcessor {
    private InformCustomerService informCustomerService;
    private OrderService orderService;

    public OrderProcessor(InformCustomerService informCustomerService, OrderService orderService) {
        this.informCustomerService = informCustomerService;
        this.orderService = orderService;
    }

    public void processor(OrderRequest orderRequest){
        informCustomerService.firstInformation(orderRequest.getOrder().getCustomer());
        System.out.println("Przekazujemy zamówienie do: " + orderRequest.getShops().getShopName());
        boolean isOrdered = orderService.orderService(orderRequest.getShops());

        if(isOrdered){
            informCustomerService.secondInformation(orderRequest.getShops().getShopName());
        }else{
            informCustomerService.thirdInformation();
        }

    }
}
