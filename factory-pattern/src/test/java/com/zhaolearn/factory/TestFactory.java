package com.zhaolearn.factory;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class TestFactory {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testFactory()
    {
        FruitFactory fruitFactory=new FruitFactory();
        Fruit fruit1=fruitFactory.getFruit("Apple");
        Fruit fruit2=fruitFactory.getFruit("Orange");
        Fruit fruit3=fruitFactory.getFruit("Watermalon");
        fruit1.tellMeName();
        fruit2.tellMeName();
        fruit3.tellMeName();
    }
}
