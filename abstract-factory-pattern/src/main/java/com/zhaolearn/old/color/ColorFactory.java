package com.zhaolearn.old.color;


import com.zhaolearn.old.AbstractFactory;
import com.zhaolearn.old.fruit.Fruit;

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
