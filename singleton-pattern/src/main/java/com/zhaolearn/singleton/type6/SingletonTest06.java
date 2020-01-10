package com.zhaolearn.singleton.type6;

/**
 * ��̬�ڲ���
 *
 *
 *
 *
 * @author: HeHaoZhao
 * @date: 2020/1/10 15:32
 */
public class SingletonTest06 {
	public static void main(String[] args) {
		System.out.println("ʹ�þ�̬�ڲ�����ɵ���ģʽ");
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance == instance2); // true
		System.out.println("instance.hashCode=" + instance.hashCode());
		System.out.println("instance2.hashCode=" + instance2.hashCode());
	}
}

// ��̬�ڲ�����ɣ� �Ƽ�ʹ��
class Singleton {
	private static volatile Singleton instance;
	//������˽�л�
	private Singleton() {}
	//дһ����̬�ڲ���,��������һ����̬���� Singleton
	private static class SingletonInstance {
		private static final Singleton INSTANCE = new Singleton(); 
	}
	//�ṩһ����̬�Ĺ��з�����ֱ�ӷ���SingletonInstance.INSTANCE
	public static synchronized Singleton getInstance() {
		return SingletonInstance.INSTANCE;
	}
}