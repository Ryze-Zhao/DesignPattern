package com.zhaolearn.singleton.type7;

/**
 * 枚举
 *
 * @author: HeHaoZhao
 * @date: 2020/1/10 15:33
 */
public class SingletonTest07 {
	public static void main(String[] args) {
		Singleton instance = Singleton.INSTANCE;
		Singleton instance2 = Singleton.INSTANCE;
		System.out.println(instance == instance2);
		System.out.println(instance.hashCode());
		System.out.println(instance2.hashCode());
		instance.sayOK();
	}
}
//使用枚举，可以实现单例, 推荐
enum Singleton {
	INSTANCE; //属性
	public void sayOK() {
		System.out.println("ok~");
	}
}