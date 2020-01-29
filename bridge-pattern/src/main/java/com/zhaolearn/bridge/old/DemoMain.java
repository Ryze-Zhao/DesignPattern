package com.zhaolearn.bridge.old;

public class DemoMain {
    public static void main(String[] args) {
        Fruit redFruit = new Orange("大橙子", new Red());
        Fruit greenFruit = new Orange("小橙子", new Green());
        redFruit.tellMeKind();
        greenFruit.tellMeKind();
    }
}
