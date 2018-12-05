package com.zhaolearn.filter;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class TestFilter {
    @Test
    public void testFilter() {
        List<Fruit> fruits=new ArrayList<>();
        for(int i=0;i<3;i++){
            fruits.add(new Fruit("APPLE","颜色"+i));
            fruits.add(new Fruit("ORANGE","颜色"+i));
        }
        Criteria apple=new CriteriaApple();
        Criteria ORANGE=new CriteriaOrange();
        apple.fruitCriteria(fruits).stream().forEach(e->System.out.println(e));
        System.out.println("以下是橙子标准");
        ORANGE.fruitCriteria(fruits).stream().forEach(e->System.out.println(e));
    }
}
