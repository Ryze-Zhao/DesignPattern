package com.zhaolearn.decorator.old;

public class DemoMain {
    public static void main(String[] args) {
        Fruit apple = new Apple();
        Fruit redApple = new RedFruitDecorator(new Apple());
        Fruit redOrange = new RedFruitDecorator(new Orange());
        System.out.println("Apple is normal");
        apple.tellMeName();
        System.out.println("\nApple is red");
        redApple.tellMeName();
        System.out.println("\nOrange is red");
        redOrange.tellMeName();
    }
}
