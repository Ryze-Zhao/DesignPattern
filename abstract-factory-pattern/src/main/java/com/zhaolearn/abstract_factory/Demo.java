package com.zhaolearn.abstract_factory;

import com.zhaolearn.abstract_factory.factory.FactoryA;
import com.zhaolearn.abstract_factory.factory.FactoryB;
import com.zhaolearn.abstract_factory.factory.FactoryC;
import com.zhaolearn.abstract_factory.factory.IFactory;
import com.zhaolearn.abstract_factory.fruit.Fruit;
import com.zhaolearn.abstract_factory.outer_packaging.Packaging;


public class Demo {
    public static void main(String[] args) {
        IFactory factoryA = new FactoryA();
        Fruit fruit1 = factoryA.createFruit();
        fruit1.tellMeName();
        Packaging packaging1 = factoryA.giveMePackaging();
        packaging1.tellMePackagingName();

        IFactory factoryB = new FactoryB();
        Fruit fruit2 = factoryB.createFruit();
        fruit2.tellMeName();
        Packaging packaging2 = factoryB.giveMePackaging();
        packaging2.tellMePackagingName();

        IFactory factoryC = new FactoryC();
        Fruit fruit3 = factoryC.createFruit();
        fruit3.tellMeName();
        Packaging packaging3 = factoryC.giveMePackaging();
        packaging3.tellMePackagingName();
    }
}
