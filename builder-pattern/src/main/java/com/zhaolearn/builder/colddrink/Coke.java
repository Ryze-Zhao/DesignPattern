package com.zhaolearn.builder.colddrink;

public class Coke extends ColdDrink {
    @Override
    public String tellMeName() {
        return "Coke";
    }
    @Override
    public float price() {
        return 10.0f;
    }
}
