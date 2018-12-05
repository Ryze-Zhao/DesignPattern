package com.zhaolearn.composite;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class TestComposite {

    @Test
    public void testComposite() {
        Student a = new Student("学生a");
        Student b1 = new Student("学生b1");
        Student c1 = new Student("学生c1");
        Student c2 = new Student("学生c2");
        b1.setStudents(new ArrayList<Student>(Arrays.asList(c1, c2)));
        a.setStudents(new ArrayList<Student>(Arrays.asList(b1)));
        System.out.println(b1.toString());
        System.out.println(a.toString());
    }
}
