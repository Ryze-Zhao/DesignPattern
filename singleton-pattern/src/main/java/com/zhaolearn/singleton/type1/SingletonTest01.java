package com.zhaolearn.singleton.type1;



/**
 * 饿汉式(静态变量)
 *
 * 1、构造器私有化 (防止 new )
 * 2、类的内部创建对象
 * 3、向外暴露一个静态的公共方法。getInstance
 * 4、代码实现
 *
 *
 * @author: HeHaoZhao
 * @date: 2020/1/9 16:43
 */
public class SingletonTest01 {
	public static void main(String[] args) {
		//测试
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance == instance2); // true
		System.out.println("instance.hashCode=" + instance.hashCode());
		System.out.println("instance2.hashCode=" + instance2.hashCode());
	}
}

//饿汉式(静态变量)
class Singleton {
	//1. 构造器私有化, 防止外部能new
	private Singleton() {}
	//2.本类内部创建对象实例
	private final static Singleton instance = new Singleton();
	//3. 提供一个公有的静态方法，返回实例对象
	public static Singleton getInstance() {return instance;}
}