package com.zhaolearn.old;

import com.zhaolearn.old.color.Color;
import com.zhaolearn.old.fruit.Fruit;
public abstract  class AbstractFactory {

    public abstract Color getColor(String color);
    public abstract Fruit getFruit(String fruit) ;

}
