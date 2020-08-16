package com.oneutf.liskov;

import javax.sound.midi.Soundbank;

/**
 * @author oneutf
 */
public class Demo {

    private void test(Animal animal){
        System.out.println(animal.getClass().getName());
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.test(new Animal());
        demo.test(new Dog());

    }
}
