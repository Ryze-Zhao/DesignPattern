package com.zhaolearn.mvc;

/**
 * Hello world!
 *
 */
public class Student {
    private String cardNo;
    private String name;

    public Student() {
    }

    public Student(String cardNo, String name) {
        this.cardNo = cardNo;
        this.name = name;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "cardNo='" + cardNo + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
