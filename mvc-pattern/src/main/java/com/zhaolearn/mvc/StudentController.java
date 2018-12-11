package com.zhaolearn.mvc;

public class StudentController {
    private Student model;
    private StudentView view;
    public void updateView() { view.printStudentDetails(model); }
    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }
    public void setStudentName(String name) { model.setName(name); }
}
