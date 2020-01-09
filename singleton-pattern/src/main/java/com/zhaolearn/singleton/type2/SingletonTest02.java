package com.zhaolearn.singleton.type2;
/**
 * 饿汉式（静态代码块）
 *	1. 构造器私有化, 防止外部能new
 *  2.本类内部创建对象实例
 *  3.在静态代码块中，创建单例对象
 *  4. 提供一个公有的静态方法，返回实例对象
 *
 *
 * @author: HeHaoZhao
 * @date: 2020/1/9 17:14
 */
public class SingletonTest02 {
	public static void main(String[] args) {
		//测试
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance == instance2); // true
		System.out.println("instance.hashCode=" + instance.hashCode());
		System.out.println("instance2.hashCode=" + instance2.hashCode());
	}
}

//饿汉式(静态代码块)
class Singleton {
	//1. 构造器私有化, 防止外部能new
	private Singleton() {}
	//2.本类内部创建对象实例
	private  static Singleton instance;
	//3.在静态代码块中，创建单例对象
	static {instance = new Singleton();}
	//4. 提供一个公有的静态方法，返回实例对象
	public static Singleton getInstance() {
		return instance;
	}
}