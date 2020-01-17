package com.zhaolearn.factorymethod;

public class Demo {
    public static void main(String[] args) {
        IFactory appleFactory = new FactoryA();
        Fruit fruit1 = appleFactory.createFruit();
        fruit1.tellMeName();

        IFactory orangeFactory = new FactoryB();
        Fruit fruit2 = orangeFactory.createFruit();
        fruit2.tellMeName();

        IFactory watermalon = new FactoryC();
        Fruit fruit3 = watermalon.createFruit();
        fruit3.tellMeName();
    }
}
