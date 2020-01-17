package com.zhaolearn.abstract_factory.factory;

import com.zhaolearn.abstract_factory.fruit.Fruit;
import com.zhaolearn.abstract_factory.fruit.Watermalon;
import com.zhaolearn.abstract_factory.outer_packaging.IronPackaging;
import com.zhaolearn.abstract_factory.outer_packaging.Packaging;

public class FactoryC implements IFactory {
    @Override
    public Fruit createFruit() {
        return new Watermalon();
    }
    @Override
    public Packaging giveMePackaging() {
        return new IronPackaging();
    }
}
