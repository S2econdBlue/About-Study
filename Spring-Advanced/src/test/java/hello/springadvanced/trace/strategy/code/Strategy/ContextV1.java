package hello.springadvanced.trace.strategy.code.Strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * 필드에 전략 보관 방식
 */
@Slf4j
public class ContextV1 {
    private Stragety stragety;

    public ContextV1(Stragety stragety) {
        this.stragety = stragety;
    }

    public void execute(){
        long startTime = System.currentTimeMillis();
        // 비즈니스 로직 실행
        stragety.call(); //위임
        // 비즈니스 로직 종료
        long endTime = System.currentTimeMillis();
        long resultTime = endTime - startTime;
        log.info("resultTime={}", resultTime);
    }
}
