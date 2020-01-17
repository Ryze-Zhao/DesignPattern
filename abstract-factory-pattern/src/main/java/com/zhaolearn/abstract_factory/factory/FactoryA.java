package com.zhaolearn.abstract_factory.factory;

import com.zhaolearn.abstract_factory.fruit.Apple;
import com.zhaolearn.abstract_factory.fruit.Fruit;
import com.zhaolearn.abstract_factory.outer_packaging.Packaging;
import com.zhaolearn.abstract_factory.outer_packaging.PaperPackaging;

public class FactoryA implements IFactory {
    @Override
    public Fruit createFruit() {
        return new Apple();
    }
    @Override
    public Packaging giveMePackaging() {
        return new PaperPackaging();
    }
}