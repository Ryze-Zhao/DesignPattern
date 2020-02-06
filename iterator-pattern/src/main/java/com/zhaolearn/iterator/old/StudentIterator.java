package com.zhaolearn.iterator.old;

import java.util.List;

public class StudentIterator implements Iterator {
    private List<Student> students;
    private int index;

    public StudentIterator(List<Student> students) {
        this.students = students;
    }

    @Override
    public boolean hasNext() {
        if (index < students.size()) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            return students.get(index++);
        }
        return null;
    }
}