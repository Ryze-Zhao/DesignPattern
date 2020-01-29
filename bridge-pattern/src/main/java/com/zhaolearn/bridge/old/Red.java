package com.zhaolearn.bridge.old;

public class Red implements ColorAPI{
    @Override
    public void tellMeColor(String kind) {
        System.out.println("My Kind is "+kind+"  My Color is Red");
    }
}
