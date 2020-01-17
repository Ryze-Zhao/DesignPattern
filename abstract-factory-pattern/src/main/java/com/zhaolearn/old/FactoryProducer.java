package com.zhaolearn.old;


import com.zhaolearn.old.color.ColorFactory;
import com.zhaolearn.old.fruit.FruitFactory;

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
