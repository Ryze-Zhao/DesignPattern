package com.zhaolearn.old;

import java.util.Hashtable;

public class FruitCache {
    private static Hashtable<String, Fruit> fruitMap
            = new Hashtable<String, Fruit>();
    public static Fruit getFruit(String FruitId) {
        Fruit cachedFruit = fruitMap.get(FruitId);
        return (Fruit) cachedFruit.clone();
    }
    // 在数据库查询然后填入，这里进行模拟查询
    // 例如，我们要添加三种形状
    public static void loadCache() {
        Apple apple = new Apple();
        apple.setId("1");
        fruitMap.put(apple.getId(),apple);
        Orange orange = new Orange();
        orange.setId("2");
        fruitMap.put(orange.getId(),orange);
        Watermalon waterMalon = new Watermalon();
        waterMalon.setId("3");
        fruitMap.put(waterMalon.getId(),waterMalon);
    }
}
