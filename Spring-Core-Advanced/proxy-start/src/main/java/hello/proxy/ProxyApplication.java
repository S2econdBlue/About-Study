package hello.proxy;

import hello.proxy.config.ConcreteProxyConfig;
import hello.proxy.trace.logtrace.LogTrace;
import hello.proxy.trace.logtrace.ThreadLocalLogTrace;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

@SpringBootApplication(scanBasePackages = "hello.proxy.app") //주의
@Import(ConcreteProxyConfig.class)
//@Import(InterfaceProxyConfig.class)
//@Import({AppV2Config.class, AppV1Config.class})
public class ProxyApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProxyApplication.class, args);
    }
    @Bean
    public LogTrace logTrace(){
        return new ThreadLocalLogTrace();
    }
}
