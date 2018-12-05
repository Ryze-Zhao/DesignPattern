package com.zhaolearn.prototype;

public class Apple extends Fruit{
    public Apple(){
        variety = "Apple";
    }//这个可以不用也行
    @Override
    public void tellMeName() {
        System.out.println("My Name is Apple");
    }
}
