package com.zhaolearn.decorator;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTestDecorator {
    @Test
    public void appTestDecorator() {
        Fruit apple = new Apple();
        Fruit redApple = new RedFruitDecorator(new Apple());
        Fruit redOrange = new RedFruitDecorator(new Orange());
        System.out.println("Apple is normal");
        apple.tellMeName();
        System.out.println("\nApple is red");
        redApple.tellMeName();
        System.out.println("\nOrange is red");
        redOrange.tellMeName();
    }
}
