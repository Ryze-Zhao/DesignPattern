package com.zhaolearn.old.burger;

import com.zhaolearn.old.Item;
import com.zhaolearn.old.packing.Packing;
import com.zhaolearn.old.packing.Wrapper;

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
