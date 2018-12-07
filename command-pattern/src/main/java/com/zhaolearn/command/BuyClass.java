package com.zhaolearn.command;

public class BuyClass implements Command {
    private RequestClass requestClass;
    public BuyClass(RequestClass requestClass){
        this.requestClass = requestClass;
    }
    @Override
    public void operate() {
        requestClass.buy();
    }
}
