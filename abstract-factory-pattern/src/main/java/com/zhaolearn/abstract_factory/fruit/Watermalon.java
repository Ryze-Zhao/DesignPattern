package com.zhaolearn.abstract_factory.fruit;

import com.zhaolearn.abstract_factory.fruit.Fruit;

public class Watermalon  implements Fruit {
    @Override
    public void tellMeName() {
        System.out.println("My Name is Watermalon");
    }
}
