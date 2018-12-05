package com.zhaolearn.builder;

import com.zhaolearn.builder.packing.Packing;

public interface Item {
    public String tellMeName();
    public Packing packing();
    public float price();
}
