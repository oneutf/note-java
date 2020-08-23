package com.oneutf.decorator;

/**
 * @author oneutf
 * @desc 黑色边框装饰类，充当具体装饰类
 */
public class BlackBorderDecorator extends ComponentDecorator{

    public BlackBorderDecorator(AbstractComponent component) {
        super(component);
    }

    @Override
    public void display() {
        this.setBlackBorder();
        super.display();
    }

    public void setBlackBorder() {
        System.out.println("为构件类添加黑色边框");
    }
}
