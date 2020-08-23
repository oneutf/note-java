package com.oneutf.decorator;

/**
 * @author oneutf
 * @desc 滚动条装饰类，充当具体构件类
 */
public class ScrollBarDecorator extends ComponentDecorator {

    public ScrollBarDecorator(AbstractComponent component) {
        super(component);
    }

    @Override
    public void display() {
        this.setScrollBar();
        super.display();
    }

    public void setScrollBar(){
        System.out.println("为构件类添加滚动条");
    }
}
