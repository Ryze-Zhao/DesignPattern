package com.zhaolearn.abstract_factory.factory;

import com.zhaolearn.abstract_factory.fruit.Fruit;
import com.zhaolearn.abstract_factory.fruit.Orange;
import com.zhaolearn.abstract_factory.outer_packaging.Packaging;
import com.zhaolearn.abstract_factory.outer_packaging.PlasticPackaging;

public class FactoryB implements IFactory {
    @Override
    public Fruit createFruit() {
        return new Orange();
    }
    @Override
    public Packaging giveMePackaging() {
        return new PlasticPackaging();
    }
}