package com.zhaolearn.iterator.old;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyStudentRepository implements Container {
    private List<Student> students;

    public MyStudentRepository(List<Student> students) {
        this.students = students;
    }

    @Override
    public Iterator iterator() {
        return new StudentIterator(students);
    }
}
