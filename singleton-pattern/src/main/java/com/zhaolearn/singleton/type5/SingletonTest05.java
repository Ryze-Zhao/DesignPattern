package com.zhaolearn.singleton.type5;

/**
 * ˫�ؼ��
 *
 * @author: HeHaoZhao
 * @date: 2020/1/10 15:18
 */
public class SingletonTest05 {
	public static void main(String[] args) {
		System.out.println("˫�ؼ��");
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance == instance2); // true
		System.out.println("instance.hashCode=" + instance.hashCode());
		System.out.println("instance2.hashCode=" + instance2.hashCode());
	}
}

// ˫�ؼ��
class Singleton {
	private static volatile Singleton instance;
	private Singleton() {}
	//�ṩһ����̬�Ĺ��з���������˫�ؼ����룬����̰߳�ȫ����, ͬʱ�������������
	//ͬʱ��֤��Ч��, �Ƽ�ʹ��
	public static synchronized Singleton getInstance() {
		if(instance == null) {
			synchronized (Singleton.class) {
				if(instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}