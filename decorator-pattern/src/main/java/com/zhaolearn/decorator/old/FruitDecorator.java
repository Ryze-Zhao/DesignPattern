package com.zhaolearn.decorator.old;

public abstract class FruitDecorator implements Fruit{
    protected Fruit decoratedFruit;

    public FruitDecorator(Fruit decoratedShape){
        this.decoratedFruit = decoratedShape;
    }

    @Override
    public void tellMeName(){
        decoratedFruit.tellMeName();
    }
}
