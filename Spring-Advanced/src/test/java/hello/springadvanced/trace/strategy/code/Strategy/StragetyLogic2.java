package hello.springadvanced.trace.strategy.code.Strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StragetyLogic2 implements Stragety{
    @Override
    public void call() {
        log.info("비즈니스 로직2 실행");
    }
}
