package com.oneutf.decorator;

/**
 * @author oneutf
 * @desc 列表框类，充当具体构件类
 */
public class ListBox extends AbstractComponent {

    @Override
    public void display() {
        System.out.println("显示列表框");
    }
}
