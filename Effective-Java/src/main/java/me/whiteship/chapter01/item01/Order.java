package me.whiteship.chapter01.item01;

public class Order {
    private boolean prime;
    private boolean urgent;
    private Product product;

//    public Order(Product product, boolean prime){
//        this.product = product;
//        this.prime = prime;
//    }
//
//    public Order(Product product, boolean urgent){
//        this.product = product;
//        this.urgent = urgent;
//    }

    // 정적 팩토리 메서드
    // 만들어주는 객체의 특징, 표현을 메서드의 이름으로 더 잘 표현할 수 있다.
    // 인스턴스를 항상 새로 만들어 줄 필요는 없다?? 무슨 말이징?
    public Order primeOrder(Product product){
        Order order = new Order();
        order.prime = true;
        order.urgent = false;
        order.product = product;

        return order;
    }
}
