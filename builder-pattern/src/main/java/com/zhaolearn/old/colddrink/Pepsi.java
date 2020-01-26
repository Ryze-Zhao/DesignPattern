package com.zhaolearn.old.colddrink;

public class Pepsi extends ColdDrink {
    @Override
    public String tellMeName() {
        return "Pepsi";
    }
    @Override
    public float price() {
        return 30.0f;
    }
}
