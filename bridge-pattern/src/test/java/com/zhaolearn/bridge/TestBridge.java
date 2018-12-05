package com.zhaolearn.bridge;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class TestBridge {
    @Test
    public void testBridge(){
        Fruit redFruit = new Orange("大橙子", new Red());
        Fruit greenFruit = new Orange("小橙子", new Green());
        redFruit.tellMeKind();
        greenFruit.tellMeKind();
    }
}
