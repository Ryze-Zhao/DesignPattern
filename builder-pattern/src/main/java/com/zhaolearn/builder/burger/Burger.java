package com.zhaolearn.builder.burger;

import com.zhaolearn.builder.Item;
import com.zhaolearn.builder.packing.Packing;
import com.zhaolearn.builder.packing.Wrapper;

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
