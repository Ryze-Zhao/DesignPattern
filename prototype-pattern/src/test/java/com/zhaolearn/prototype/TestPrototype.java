package com.zhaolearn.prototype;

import static org.junit.Assert.assertTrue;

import com.zhaolearn.old.Fruit;
import com.zhaolearn.old.FruitCache;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class TestPrototype
{
    @Test
    public void testPrototype() {
        FruitCache.loadCache();

        Fruit clonedFruit = (Fruit) FruitCache.getFruit("1");
        clonedFruit.tellMeName();

        Fruit clonedFruit2 = (Fruit) FruitCache.getFruit("2");
        clonedFruit2.tellMeName();

        Fruit clonedFruit3 = (Fruit) FruitCache.getFruit("3");
        clonedFruit3.tellMeName();
    }
}
