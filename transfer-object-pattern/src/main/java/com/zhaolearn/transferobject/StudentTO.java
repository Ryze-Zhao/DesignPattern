package com.zhaolearn.transferobject;

/**
 * Hello world!
 *
 */
public class StudentTO {
    private String name;
    private int rollNo;

    StudentTO(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
