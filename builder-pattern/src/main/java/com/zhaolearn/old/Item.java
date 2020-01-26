package com.zhaolearn.old;

import com.zhaolearn.old.packing.Packing;

public interface Item {
    public String tellMeName();
    public Packing packing();
    public float price();
}
