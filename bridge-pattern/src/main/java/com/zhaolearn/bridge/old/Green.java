package com.zhaolearn.bridge.old;

public class Green implements ColorAPI {
    @Override
    public void tellMeColor(String kind) {
        System.out.println("My Kind is "+kind+"  My Color is Green");
    }
}
