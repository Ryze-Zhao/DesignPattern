package com.zhaolearn.nullobject;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTestNullObject{

    @Test
    public void appTestNullObject() {
        AbstractFruit fruit1 = FruitFactory.getFruit("WATERMALEN");
        AbstractFruit fruit2 = FruitFactory.getFruit("ORANGE");
        AbstractFruit fruit3 = FruitFactory.getFruit("TEST1");
        AbstractFruit fruit4 = FruitFactory.getFruit("TEST2");
        System.out.println(fruit1.getName());
        System.out.println(fruit2.getName());
        System.out.println(fruit3.getName());
        System.out.println(fruit4.getName());
    }
}
