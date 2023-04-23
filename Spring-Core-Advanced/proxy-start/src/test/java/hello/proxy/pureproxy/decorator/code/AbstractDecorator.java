package hello.proxy.pureproxy.decorator.code;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class AbstractDecorator implements Component {
    protected Component component;

    AbstractDecorator(Component component) {
        this.component = component;
    }
}
