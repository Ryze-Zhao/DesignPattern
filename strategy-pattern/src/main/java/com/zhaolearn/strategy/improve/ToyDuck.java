package com.zhaolearn.strategy.improve;

public class ToyDuck extends Duck {
    public ToyDuck() {this.setFlyBehavior(new NoFlyBehavior());}
    @Override
    public void display() {
        System.out.println("--------------玩具鸭--------------");
    }
}
