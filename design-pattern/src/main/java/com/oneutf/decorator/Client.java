package com.oneutf.decorator;

/**
 * @author oneutf
 * @desc 客户端测试类
 */
public class Client {

    public static void main(String[] args) {
        AbstractComponent component, componentSB, componentBB;

        component = new Window();
        componentSB = new ScrollBarDecorator(component);
        componentBB = new BlackBorderDecorator(componentSB);

        componentBB.display();
    }
}
