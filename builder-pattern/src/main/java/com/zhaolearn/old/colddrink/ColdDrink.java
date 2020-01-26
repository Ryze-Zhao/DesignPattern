package com.zhaolearn.old.colddrink;

import com.zhaolearn.old.Item;
import com.zhaolearn.old.packing.Bottle;
import com.zhaolearn.old.packing.Packing;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
