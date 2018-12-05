package com.zhaolearn.singleton;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class TestSingleClass
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testSingleClass()
    {
        //获取唯一可用的对象
        SingleClass single = SingleClass.getInstance();
        //使用
        single.showMe();
    }
}
