package hello.proxy.app.v1;


import hello.proxy.userAnnotation.MyAnnotation;

@MyAnnotation(age = 22, sex = 'S', phoneNumber = "010-4332-8308")
public class OrderControllerV1Impl implements OrderControllerV1{
    private final OrderServiceV1 orderService;

    public OrderControllerV1Impl(OrderServiceV1 orderService) {
        this.orderService = orderService;
    }

    @Override
    public String reqeust(String itemId) {
        orderService.orderItem(itemId);
        return "ok";
    }

    @Override
    public String noLog() {
        return null;
    }
}
