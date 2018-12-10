package com.zhaolearn.nullobject;

public class Fruit implements AbstractFruit {
    private String name;
    public Fruit(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
}
