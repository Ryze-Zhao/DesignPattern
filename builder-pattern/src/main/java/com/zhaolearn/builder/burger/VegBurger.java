package com.zhaolearn.builder.burger;

public class VegBurger extends Burger {
    @Override
    public String tellMeName() {
        return "VegBurger";
    }
    @Override
    public float price() {
        return 33.0f;
    }
}
