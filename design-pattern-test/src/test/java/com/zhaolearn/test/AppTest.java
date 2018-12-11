package com.zhaolearn.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * 测试int,基本类型，不会修改
     */
    @Test
    public void testInt() {
        for (int i = 0; i < 100; i++) {
            System.out.println((int)(Math.random() * 300)+600);
        }
    }

}
