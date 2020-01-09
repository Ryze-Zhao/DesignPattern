package com.zhaolearn.singleton.type1;



/**
 * ����ʽ(��̬����)
 *
 * 1��������˽�л� (��ֹ new )
 * 2������ڲ���������
 * 3�����Ⱪ¶һ����̬�Ĺ���������getInstance
 * 4������ʵ��
 *
 *
 * @author: HeHaoZhao
 * @date: 2020/1/9 16:43
 */
public class SingletonTest01 {
	public static void main(String[] args) {
		//����
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance == instance2); // true
		System.out.println("instance.hashCode=" + instance.hashCode());
		System.out.println("instance2.hashCode=" + instance2.hashCode());
	}
}

//����ʽ(��̬����)
class Singleton {
	//1. ������˽�л�, ��ֹ�ⲿ��new
	private Singleton() {}
	//2.�����ڲ���������ʵ��
	private final static Singleton instance = new Singleton();
	//3. �ṩһ�����еľ�̬����������ʵ������
	public static Singleton getInstance() {return instance;}
}