package com.zhaolearn.iterator.old;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * 简单版本
 * @author: HeHaoZhao
 * @date: 2020/2/6 20:37
 */
public class DemoMain {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student("haha", "hehe"),
                new Student("haha1", "hehe1"),
                new Student("haha1", "hehe1")));
        MyStudentRepository myStudentRepository = new MyStudentRepository(students);
        Iterator aa = myStudentRepository.iterator();
        while (aa.hasNext()) {
            Student bb = (Student) aa.next();
            System.out.println(bb.toString());
        }
    }
}
