package com.oneutf.decorator;

/**
 * @author oneutf
 * @desc 构件装饰类，充当抽象装饰类
 */
public class ComponentDecorator extends AbstractComponent {

    private AbstractComponent component;

    public ComponentDecorator(AbstractComponent component) {
        this.component = component;
    }

    @Override
    public void display() {
        component.display();
    }
}
