package com.zhaolearn.tradition;



import java.util.ArrayList;
import java.util.List;
import lombok.Data;
//客户端
public class Demeter {
	public static void main(String[] args) {
		SchoolManager schoolManager=new SchoolManager();
		schoolManager.printAllTeacher(new TeacherManager());
	}
}

//老师类
@Data
class Teacher {private String id;}

//管理老师的类
class TeacherManager {
	//返回所有老师（模拟读取到数据）
	public List<Teacher> getAllTeacher() {
		List<Teacher> list = new ArrayList<Teacher>();
		for (int i = 0; i < 5; i++) {
			Teacher teacher = new Teacher();
			teacher.setId("老师id= " + i);
			list.add(teacher);
		}
		return list;
	}
}

////学校管理类
//SchoolManager的直接朋友类有TeacherManager（作为参数） ，但是Teacher只是陌生类（只作为局部变量）违反了迪米特法则
class SchoolManager {
	//该方法完成输出学校老师信息(id)
	void printAllTeacher(TeacherManager teacherManager) {
		//分析问题
		//1. 这里的 Teacher 不是  SchoolManager的直接朋友
		//2. Teacher 是以局部变量方式出现在 SchoolManager
		//3. 违反了 迪米特法则
		List<Teacher> allTeacher = teacherManager.getAllTeacher();
		System.out.println("------------老师------------");
		for (Teacher e : allTeacher) {
			System.out.println(e.getId());
		}
	}
}
