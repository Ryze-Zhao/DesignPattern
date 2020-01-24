package com.zhaolearn.old;

public class Watermalon extends Fruit{
    public Watermalon(){ variety = "Watermalon"; }//这个可以不用也行
    @Override
    public void tellMeName() {
        System.out.println("My Name is Watermalon");
    }
}
