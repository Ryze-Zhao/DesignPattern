package com.zhaolearn.iterator;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTestIterator {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void appTestIterator() {
        MyStudentRepository myStudentRepository = new MyStudentRepository();
        Iterator aa = myStudentRepository.iterator();
        while (aa.hasNext()) {
            Student bb = (Student) aa.next();
            System.out.println(bb.toString());
        }
    }
}
