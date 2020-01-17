package com.zhaolearn.old;

import static org.junit.Assert.assertTrue;

import com.zhaolearn.old.color.*;
import com.zhaolearn.old.fruit.*;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class TestAbstractFactory
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testAbstractFactory() {
        //获取水果工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("Fruit");
        Fruit fruit1 = shapeFactory.getFruit("Apple");
        Fruit fruit2 = shapeFactory.getFruit("Orange");
        Fruit fruit3 = shapeFactory.getFruit("Watermalon");
        fruit1.tellMeName();
        fruit2.tellMeName();
        fruit3.tellMeName();
        //获取颜色工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory("Color");
        Color color1 = colorFactory.getColor("Red");
        Color color2 = colorFactory.getColor("Blue");
        Color color3 = colorFactory.getColor("Green");
        color1.tellMeColorName();
        color2.tellMeColorName();
        color3.tellMeColorName();

    }
}
