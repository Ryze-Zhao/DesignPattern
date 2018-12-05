package com.zhaolearn.decorator;

public abstract class FruitDecorator implements Fruit{
    protected Fruit decoratedFruit;

    public FruitDecorator(Fruit decoratedShape){
        this.decoratedFruit = decoratedShape;
    }

    public void tellMeName(){
        decoratedFruit.tellMeName();
    }
}
