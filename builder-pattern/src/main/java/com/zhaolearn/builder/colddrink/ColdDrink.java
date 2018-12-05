package com.zhaolearn.builder.colddrink;

import com.zhaolearn.builder.Item;
import com.zhaolearn.builder.packing.Bottle;
import com.zhaolearn.builder.packing.Packing;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
