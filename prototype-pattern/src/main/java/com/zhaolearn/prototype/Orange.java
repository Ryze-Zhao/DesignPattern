package com.zhaolearn.prototype;

public class Orange extends Fruit {
    public Orange(){
        variety = "Orange";
    }//这个可以不用也行
    @Override
    public void tellMeName() {
        System.out.println("My Name is Orange");
    }
}
