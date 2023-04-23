package hello.proxy.app.v1;

public class OrderRepositoryV1Impl implements OrderRepositoryV1 {
    @Override
    public void save(String itemId) throws IllegalAccessException {
        //저장 로직

        if (itemId.equals("ex")) {
            throw new IllegalAccessException("예 외 발 생 !");
        }
        sleep(1000);
    }

    private void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
