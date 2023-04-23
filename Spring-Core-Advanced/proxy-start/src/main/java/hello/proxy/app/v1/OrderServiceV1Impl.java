package hello.proxy.app.v1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OrderServiceV1Impl implements OrderServiceV1 {

    private OrderRepositoryV1 orderRepository;

    public OrderServiceV1Impl(OrderRepositoryV1 orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public void orderItem(String itemId) {
        try {
            orderRepository.save(itemId);
        } catch (Exception e) {
            log.info("{}",e);
        }

    }
}
