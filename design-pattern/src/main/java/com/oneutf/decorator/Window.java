package com.oneutf.decorator;

/**
 * @author oneutf
 * @desc 窗体类，充当具体构件类
 */
public class Window extends AbstractComponent {

    @Override
    public void display() {
        System.out.println("显示窗体");
    }
}
