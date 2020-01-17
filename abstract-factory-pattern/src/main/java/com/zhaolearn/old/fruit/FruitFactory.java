package com.zhaolearn.old.fruit;


import com.zhaolearn.old.AbstractFactory;
import com.zhaolearn.old.color.Color;

public class FruitFactory  extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
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
