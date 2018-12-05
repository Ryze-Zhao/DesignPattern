package com.zhaolearn.composite;

import java.util.List;

public class Student {
    private String name;
    private List<Student> students;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", students=" + students +
                '}';
    }

    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }

    public Student(String name, List<Student> students) {

        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
