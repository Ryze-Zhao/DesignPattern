package com.zhaolearn.abstractfactory;

import com.zhaolearn.abstractfactory.color.Color;
import com.zhaolearn.abstractfactory.fruit.Fruit;
public abstract  class AbstractFactory {

    public abstract Color getColor(String color);
    public abstract Fruit getFruit(String fruit) ;

}
