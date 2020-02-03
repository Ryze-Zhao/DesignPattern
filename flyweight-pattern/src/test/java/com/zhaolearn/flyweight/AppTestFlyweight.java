package com.zhaolearn.flyweight;

import static org.junit.Assert.assertTrue;

import com.zhaolearn.flyweight.old.FruitFactory;
import com.zhaolearn.flyweight.old.Orange;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTestFlyweight {
    private static final String name[] = { "tinyOrange", "smallOrange", "secondaryOrange", "bigOrange", "hugeOrange" };
    private static final String Colors[] = { "Red", "Blue", "Green","White", "Black"};
    @Test
    public void appTestFlyweight() {
            for(int i=0; i < 10; ++i) {
                Orange orange = (Orange) FruitFactory.getOrange(getRandomName());
               orange.setColor(getRandomColor());
               orange.tellMeNameAndColor();
            }
        }
        private static String getRandomName() {
            return name[(int)(Math.random()*name.length)];
        }
    private static String getRandomColor() {
        return Colors[(int)(Math.random()*Colors.length)];
    }
}
