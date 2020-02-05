package com.zhaolearn.command.old;

public class SellClass implements Command {
    private RequestClass requestClass;
    public SellClass(RequestClass requestClass){
        this.requestClass = requestClass;
    }
    @Override
    public void operate() {
        requestClass.sell();
    }
}
