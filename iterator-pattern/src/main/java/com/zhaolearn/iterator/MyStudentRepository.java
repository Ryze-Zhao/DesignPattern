package com.zhaolearn.iterator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyStudentRepository implements Container {
    private List<Student> aa = new ArrayList<>(Arrays.asList(
            new Student("haha", "hehe"),
            new Student("haha1", "hehe1"),
            new Student("haha1", "hehe1")));
    @Override
    public Iterator iterator() {
        return new StudentIterator();
    }
    private class StudentIterator implements Iterator {
        int index;
        @Override
        public boolean hasNext() {
            if (index < aa.size()) {
                return true;
            }
            return false;
        }
        @Override
        public Object next() {
            if (this.hasNext()) {
                return aa.get(index++);
            }
            return null;
        }
    }
}
