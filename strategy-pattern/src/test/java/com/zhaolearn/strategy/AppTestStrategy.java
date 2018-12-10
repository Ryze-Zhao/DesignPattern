package com.zhaolearn.strategy;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTestStrategy {
    @Test
    public void appTestStrategy() {
        Context context = new Context(new AddOperation());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));
        context = new Context(new SubOperation());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
        context = new Context(new MultiplyOperation());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
