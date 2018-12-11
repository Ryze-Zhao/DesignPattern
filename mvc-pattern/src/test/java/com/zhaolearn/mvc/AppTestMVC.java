package com.zhaolearn.mvc;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTestMVC {
    @Test
    public void appTestMVC(){
        //从数据库获取学生记录
        Student model  = retriveStudentFromDatabase();
        //创建一个视图：把学生详细信息输出到控制台
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        //更新模型数据
        controller.setStudentName("John");
        controller.updateView();
    }
    private static Student retriveStudentFromDatabase(){
        return new Student("10","Robert");
    }
}
