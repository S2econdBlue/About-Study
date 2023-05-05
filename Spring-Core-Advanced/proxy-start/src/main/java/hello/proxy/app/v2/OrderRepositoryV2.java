package hello.proxy.app.v2;

public class OrderRepositoryV2 {
    public void save(String itemId) throws IllegalAccessException {
        if(itemId.equals("ex")){
            throw new IllegalAccessException("예 외 발 생 !");
        }
        sleep(1000);
    }

    private void sleep(int millis) {
        try {
            Thread.sleep(millis);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
