package com.zhaolearn.abstractfactory;


import com.zhaolearn.abstractfactory.color.ColorFactory;
import com.zhaolearn.abstractfactory.fruit.FruitFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("Fruit")){
            return new FruitFactory();
        } else if(choice.equalsIgnoreCase("Color")){
            return new ColorFactory();
        }
        return null;
    }
}
