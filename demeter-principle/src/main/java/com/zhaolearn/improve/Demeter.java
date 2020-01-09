package com.zhaolearn.improve;




import java.util.ArrayList;
import java.util.List;
import lombok.Data;
//�ͻ���
public class Demeter {
	public static void main(String[] args) {
		SchoolManager schoolManager=new SchoolManager();
		schoolManager.printAllTeacher(new TeacherManager());
	}
}
//��ʦ��
@Data
class Teacher {private String id;}
//������ʦ����
class TeacherManager {
	//����������ʦ��ģ���ȡ�����ݣ�
	public List<Teacher> getAllTeacher() {
		List<Teacher> list = new ArrayList<Teacher>();
		for (int i = 0; i < 5; i++) {
			Teacher teacher = new Teacher();
			teacher.setId("��ʦid= " + i);
			list.add(teacher);
		}
		return list;
	}
	public void printAllTeacher(){
		List<Teacher> allTeacher = this.getAllTeacher();
		System.out.println("------------��ʦ------------");
		for (Teacher e : allTeacher) {
			System.out.println(e.getId());
		}
	}
}

////ѧУ������
class SchoolManager {
	//�÷���������ѧУ��ʦ��Ϣ(id)
	void printAllTeacher(TeacherManager teacherManager) {
		//Ϊʲômain����ֱ�ӵ��õ�ԭ���ǣ���Ϊ�������ﲻֻ�����ʦ��Ϣ�����������ѧ����Ϣ
		teacherManager.getAllTeacher();
	}
}
