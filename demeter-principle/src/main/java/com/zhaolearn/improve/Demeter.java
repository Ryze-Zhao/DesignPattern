package com.zhaolearn.improve;




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
	public void printAllTeacher(){
		List<Teacher> allTeacher = this.getAllTeacher();
		System.out.println("------------老师------------");
		for (Teacher e : allTeacher) {
			System.out.println(e.getId());
		}
	}
}

////学校管理类
class SchoolManager {
	//该方法完成输出学校老师信息(id)
	void printAllTeacher(TeacherManager teacherManager) {
		//为什么main方法直接调用的原因是，因为可能这里不只输出老师信息，还可能输出学生信息
		teacherManager.getAllTeacher();
	}
}
