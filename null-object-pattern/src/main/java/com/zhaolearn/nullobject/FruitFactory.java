package com.zhaolearn.nullobject;

public class FruitFactory {
    public static final String[] names = {"APPLE", "ORANGE", "WATERMALEN"};

    public static AbstractFruit getFruit(String name){
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)){
                return new Fruit(name);
            }
        }
        return new NullFruit(name);
    }
}
