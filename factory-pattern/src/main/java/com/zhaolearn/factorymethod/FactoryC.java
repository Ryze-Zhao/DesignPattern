package com.zhaolearn.factorymethod;

public class FactoryC implements IFactory {
    @Override
    public Fruit createFruit() {
        return new Watermalon();
    }
}
