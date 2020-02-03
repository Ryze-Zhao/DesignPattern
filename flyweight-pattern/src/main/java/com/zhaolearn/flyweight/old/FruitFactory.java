package com.zhaolearn.flyweight.old;

import java.util.HashMap;

public class FruitFactory {
    private static final HashMap<String, Fruit> orangeMap = new HashMap<>();

    public static Fruit getOrange(String name) {
        Orange orange = (Orange) orangeMap.get(name);
        if (orange == null) {
            orange = new Orange(name);
            orangeMap.put(name, orange);
            System.out.println("存入名字为" + name+"的橙子" );
        }
        return orange;
    }
}
