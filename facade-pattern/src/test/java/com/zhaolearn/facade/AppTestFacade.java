package com.zhaolearn.facade;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTestFacade {
    @Test
    public void appTestFacade() {
        FruitMaker fruitMaker = new FruitMaker();
        fruitMaker.tellMeNameApple();
        fruitMaker.tellMeNameOrange();
        fruitMaker.tellMeNameWatermalon();
    }
}
