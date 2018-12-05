package com.zhaolearn.factory;

public class FruitFactory {
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
