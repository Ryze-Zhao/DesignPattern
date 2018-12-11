package com.zhaolearn.transferobject;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTestTransferObaject {
    @Test
    public void appTestTransferObaject(){
        StudentBO studentBusinessObject = new StudentBO();
        //输出所有的学生
        for (StudentTO student : studentBusinessObject.getAllStudents()) {
            System.out.println("Student: [RollNo : " +student.getRollNo()+", Name : "+student.getName()+" ]");
        }
        //更新学生
        StudentTO student =studentBusinessObject.getAllStudents().get(0);
        student.setName("Michael");
        studentBusinessObject.updateStudent(student);
        //获取学生
        studentBusinessObject.getStudent(0);
        System.out.println("Student: [RollNo : " +student.getRollNo()+", Name : "+student.getName()+" ]");
    }
}
