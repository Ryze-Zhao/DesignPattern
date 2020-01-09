package com.zhaolearn.tradition;



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
}

////ѧУ������
//SchoolManager��ֱ����������TeacherManager����Ϊ������ ������Teacherֻ��İ���ֻࣨ��Ϊ�ֲ�������Υ���˵����ط���
class SchoolManager {
	//�÷���������ѧУ��ʦ��Ϣ(id)
	void printAllTeacher(TeacherManager teacherManager) {
		//��������
		//1. ����� Teacher ����  SchoolManager��ֱ������
		//2. Teacher ���Ծֲ�������ʽ������ SchoolManager
		//3. Υ���� �����ط���
		List<Teacher> allTeacher = teacherManager.getAllTeacher();
		System.out.println("------------��ʦ------------");
		for (Teacher e : allTeacher) {
			System.out.println(e.getId());
		}
	}
}
