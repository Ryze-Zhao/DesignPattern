package com.zhaolearn.decorator;

public class RedFruitDecorator extends FruitDecorator{
    public RedFruitDecorator(Fruit decoratedFruit) {
        super(decoratedFruit);
    }
    @Override
    public void tellMeName() {
        decoratedFruit.tellMeName();
        setRedBorder(decoratedFruit);
    }
    private void setRedBorder(Fruit decoratedFruit){
        System.out.println("Fruit Color: Red");
    }
}
