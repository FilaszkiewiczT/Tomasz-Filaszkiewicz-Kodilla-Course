package com.kodilla.good.patterns.challenges.food2door;



public class OrderProcessor {
    private InformCustomerService informCustomerService;
    private OrderService orderService;

    public OrderProcessor(InformCustomerService informCustomerService, OrderService orderService) {
        this.informCustomerService = informCustomerService;
        this.orderService = orderService;
    }

    public void processor(OrderRequest orderRequest){
        informCustomerService.firstInformation(orderRequest.retrieve().getCustomer());
        boolean isOrdered = orderService.orderService(orderRequest.retrieve().getShop());

        if(isOrdered){
            informCustomerService.secondInformation(orderRequest.retrieve().getShop().getShopName());
        }else{
            informCustomerService.thirdInformation();
        }

    }
}
