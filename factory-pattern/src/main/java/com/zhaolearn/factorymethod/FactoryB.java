package com.zhaolearn.factorymethod;

public class FactoryB implements IFactory {
    @Override
    public Fruit createFruit() {
        return new Orange();
    }
}