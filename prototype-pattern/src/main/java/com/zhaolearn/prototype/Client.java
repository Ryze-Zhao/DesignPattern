package com.zhaolearn.prototype;



public class Client {
	public static void main(String[] args) {
		System.out.println("ԭ��ģʽ��ɶ���Ĵ���");
		Sheep sheep = new Sheep("����");
		//��¡
		Sheep sheep2 = (Sheep)sheep.clone();
		Sheep sheep3 = (Sheep)sheep.clone();
		Sheep sheep4 = (Sheep)sheep.clone();
		Sheep sheep5 = (Sheep)sheep.clone();
		System.out.println("sheep2 =" + sheep2+"sheep2.hashCode ="+sheep2.hashCode());
		System.out.println("sheep3 =" + sheep3+"sheep3.hashCode ="+sheep3.hashCode());
		System.out.println("sheep4 =" + sheep4+"sheep4.hashCode ="+sheep4.hashCode());
		System.out.println("sheep5 =" + sheep5+"sheep5.hashCode ="+sheep5.hashCode());
	}
}
