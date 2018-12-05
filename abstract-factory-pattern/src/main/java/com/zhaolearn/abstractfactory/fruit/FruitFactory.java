package com.zhaolearn.abstractfactory.fruit;


import com.zhaolearn.abstractfactory.AbstractFactory;
import com.zhaolearn.abstractfactory.color.Color;

public class FruitFactory  extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    public Fruit getFruit(String fruitName){
        if(fruitName == null){
            return null;
        }
        if(fruitName.equalsIgnoreCase("Apple")){
            return new Apple();
        } else if(fruitName.equalsIgnoreCase("Orange")){
            return new Orange();
        } else if(fruitName.equalsIgnoreCase("Watermalon")){
            return new Watermalon();
        }
        return null;
    }
}
