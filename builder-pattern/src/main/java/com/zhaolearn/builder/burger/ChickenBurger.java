package com.zhaolearn.builder.burger;

public class ChickenBurger extends Burger {
    @Override
    public String tellMeName() {
        return "ChickenBurger";
    }
    @Override
    public float price() {
        return 133.0f;
    }
}
