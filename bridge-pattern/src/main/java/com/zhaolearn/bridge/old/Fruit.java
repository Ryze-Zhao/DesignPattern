package com.zhaolearn.bridge.old;

public abstract class Fruit {
    protected ColorAPI colorAPI;
    protected  Fruit(ColorAPI colorAPI){
        this.colorAPI=colorAPI;
    }
    public abstract void tellMeKind();
}
