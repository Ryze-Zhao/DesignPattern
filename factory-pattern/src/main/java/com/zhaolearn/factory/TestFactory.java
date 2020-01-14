package com.zhaolearn.factory;

public class TestFactory {
    public static void main(String[] args) {
        FruitFactory fruitFactory=new FruitFactory();
        Fruit fruit1=fruitFactory.getFruit("Apple");
        Fruit fruit2=fruitFactory.getFruit("Orange");
        Fruit fruit3=fruitFactory.getFruit("Watermalon");
        fruit1.tellMeName();
        fruit2.tellMeName();
        fruit3.tellMeName();
    }
}
