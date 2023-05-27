package hello.proxy.userAnnotation;

import java.lang.annotation.*;

@Target({ElementType.TYPE}) // Type: 클래스, 이넘, 인터페이스
@Documented
public @interface MyAnnotation {
    String name() default "홍길동";
    String phoneNumber();
    int age();
    char sex();
}
