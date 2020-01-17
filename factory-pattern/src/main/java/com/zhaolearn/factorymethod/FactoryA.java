package com.zhaolearn.factorymethod;

public class FactoryA implements IFactory {
    @Override
    public Fruit createFruit() {
        return new Apple();
    }
}