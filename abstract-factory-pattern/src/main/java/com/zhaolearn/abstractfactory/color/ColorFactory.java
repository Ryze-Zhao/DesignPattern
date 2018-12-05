package com.zhaolearn.abstractfactory.color;


import com.zhaolearn.abstractfactory.AbstractFactory;
import com.zhaolearn.abstractfactory.fruit.Fruit;

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("Red")){
            return new Red();
        } else if(color.equalsIgnoreCase("Blue")){
            return new Blue();
        } else if(color.equalsIgnoreCase("Green")){
            return new Green();
        }
        return null;
    }

    @Override
    public Fruit getFruit(String fruit) {
        return null;
    }
}
