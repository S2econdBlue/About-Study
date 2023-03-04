package hello.springadvanced.trace.strategy.code.Strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * 파라미터로 전달 받는 전략 방식
 */
@Slf4j
public class ContextV2 {
    public void execute(Stragety stragety){
        long startTime = System.currentTimeMillis();
        // 비즈니스 로직 실행
        stragety.call(); //위임
        // 비즈니스 로직 종료
        long endTime = System.currentTimeMillis();
        long resultTime = endTime - startTime;
        log.info("resultTime={}", resultTime);
    }
}
