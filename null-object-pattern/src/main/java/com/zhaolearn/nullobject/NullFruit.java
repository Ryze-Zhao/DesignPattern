package com.zhaolearn.nullobject;

public class NullFruit implements AbstractFruit {
    private String name;
    public NullFruit(String name) {
        this.name = "不存在该水果："+name;
    }
    @Override
    public String getName() {
        return name;
    }
}
