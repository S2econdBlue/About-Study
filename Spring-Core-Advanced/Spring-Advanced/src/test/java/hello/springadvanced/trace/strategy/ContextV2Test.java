package hello.springadvanced.trace.strategy;

import hello.springadvanced.trace.strategy.code.Strategy.ContextV2;
import hello.springadvanced.trace.strategy.code.Strategy.Stragety;
import hello.springadvanced.trace.strategy.code.Strategy.StragetyLogic1;
import hello.springadvanced.trace.strategy.code.Strategy.StragetyLogic2;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class ContextV2Test {
    /**
     * 전략 패턴 적용
     */
    @Test
    void strategyV1(){
        ContextV2 contextV2 = new ContextV2();
        contextV2.execute(new StragetyLogic1());
        contextV2.execute(new StragetyLogic2());
    }

    /**
     * 전략 패턴 적용
     */
    @Test
    void strategyV2(){
        ContextV2 contextV2 = new ContextV2();
        contextV2.execute(new Stragety() {
            @Override
            public void call() {
                log.info("비즈니스 로직1");
            }
        });
        contextV2.execute(new Stragety() {
            @Override
            public void call() {
                log.info("비즈니스 로직2");
            }
        });
    }
    @Test
    void strategyV3(){
        ContextV2 contextV2 = new ContextV2();
        contextV2.execute(() -> log.info("비즈니스 로직1"));
        contextV2.execute(() -> log.info("비즈니스 로직2"));
    }
}
