package hello.springadvanced.trace.strategy;

import hello.springadvanced.trace.strategy.code.Strategy.ContextV1;
import hello.springadvanced.trace.strategy.code.Strategy.Stragety;
import hello.springadvanced.trace.strategy.code.Strategy.StragetyLogic1;
import hello.springadvanced.trace.strategy.code.Strategy.StragetyLogic2;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class ContextV1Test {
    @Test
    void strategyV0() {
        logic1();
        logic2();
    }

    private void logic1() {
        long startTime = System.currentTimeMillis();
        // 비즈니스 로직 실행
        log.info("비즈니스 로직1 실행");
        // 비즈니스 로직 종료
        long endTime = System.currentTimeMillis();
        long resultTime = endTime - startTime;
        log.info("resultTime={}", resultTime);
    }

    private void logic2() {
        long startTime = System.currentTimeMillis();
        // 비즈니스 로직 실행
        log.info("비즈니스 로직2 실행");
        // 비즈니스 로직 종료
        long endTime = System.currentTimeMillis();
        long resultTime = endTime - startTime;
        log.info("resultTime={}", resultTime);
    }

    /**
     * 전략 패턴 사용
     */
    @Test
    void strategyV1(){
        StragetyLogic1 stragetyLogic1 = new StragetyLogic1();
        ContextV1 contextV1 = new ContextV1(stragetyLogic1);
        contextV1.execute();

        StragetyLogic2 stragetyLogic2 = new StragetyLogic2();
        ContextV1 contextV2 = new ContextV1(stragetyLogic2);
        contextV2.execute();
    }

    @Test
    void strategyV2(){
        Stragety stragetyLogic1 = new Stragety() {
            @Override
            public void call() {
                log.info("비즈니스 로직1 실행");
            }
        };

        ContextV1 contextV1 = new ContextV1(stragetyLogic1);
        log.info("StrategyLogic1={}", stragetyLogic1.getClass());
        contextV1.execute();

        Stragety stragetyLogic2 = new Stragety() {
            @Override
            public void call() {
                log.info("비즈니스 로직2 실행");
            }
        };

        ContextV1 contextV2 = new ContextV1(stragetyLogic2);
        log.info("StrategyLogic1={}", stragetyLogic2.getClass());
        contextV2.execute();
    }

    @Test
    void strategyV3(){
        ContextV1 contextV1 = new ContextV1(new Stragety() {
            @Override
            public void call() {
                log.info("비즈니스 로직1 실행");
            }
        });
        contextV1.execute();
        ContextV1 contextV2 = new ContextV1(new Stragety() {
            @Override
            public void call() {
                log.info("비즈니스 로직2 실행");
            }
        });
        contextV2.execute();
    }

    @Test
    void strategyV4(){
        ContextV1 contextV1 = new ContextV1(() -> log.info("비즈니스 로직1 실행"));
        contextV1.execute();
        ContextV1 contextV2 = new ContextV1(() -> log.info("비즈니스 로직2 실행"));
        contextV2.execute();
    }
}
