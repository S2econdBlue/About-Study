package hello.proxy.app.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping//스프링은 @Controller or @RequestMapping이 있어야 스프링 컨트롤러로 인식
@ResponseBody
public interface OrderControllerV1 {
    @GetMapping("/v1/request")
    //인터페이스에는 구체적으로 파라미터 어노테이션을 적용해야 제대로 인식
    //일반적인 컨트롤러 클래스에서는 생략해도 무방
    String reqeust(@RequestParam("itemId") String itemId);

    @GetMapping("/v1/no-log")
    String noLog();
}
