package com.zhaolearn.bridge;

public class Orange extends Fruit {
    private String kind;
    protected Orange(String kind,ColorAPI colorAPI) {
        super(colorAPI);
        this.kind=kind;
    }
    @Override
    public void tellMeKind() {
        colorAPI.tellMeColor(kind);
    }
}
