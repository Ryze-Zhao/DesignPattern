package com.zhaolearn.compositeentity.improve;

public  class DemoMain{
	public static void main(String[] args) {
		//�Ӵ�С�������� ѧУ
		OrganizationComponent university = new University("��ɽ��ѧ", " ��ɽ��ѧ ");
		
		//���� ѧԺ
		OrganizationComponent computerCollege = new College("�����ѧԺ", " �����ѧԺ ");
		OrganizationComponent infoEngineercollege = new College("��Ϣ����ѧԺ", " ��Ϣ����ѧԺ ");

		//��������ѧԺ�����ϵ(רҵ)
		computerCollege.add(new Department("�������", " ������̲��� "));
		computerCollege.add(new Department("���繤��", " ���繤�̲��� "));
		computerCollege.add(new Department("�������ѧ�뼼��", " �������ѧ�뼼�������Ƶ�רҵ "));
		
		//��������ѧԺ�����ϵ(רҵ)
		infoEngineercollege.add(new Department("ͨ�Ź���", " ͨ�Ź��̲���ѧ "));
		infoEngineercollege.add(new Department("��Ϣ����", " ��Ϣ���̺�ѧ "));
		
		//��ѧԺ���뵽 ѧУ
		university.add(computerCollege);
		university.add(infoEngineercollege);

		//�鿴������ѧ����Ϣ
		university.print();
		//�鿴ĳѧԺ��רҵ
//		infoEngineercollege.print();
	}
}
