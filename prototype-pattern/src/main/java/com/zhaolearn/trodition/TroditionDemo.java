package com.zhaolearn.trodition;

public class TroditionDemo {
	public static void main(String[] args) {
		//��ͳ�ķ���
		Sheep sheep = new Sheep("����");
		Sheep sheep2 = new Sheep(sheep.getName());
		Sheep sheep3 = new Sheep(sheep.getName());
		Sheep sheep4 = new Sheep(sheep.getName());
		Sheep sheep5 = new Sheep(sheep.getName());
		//....
		System.out.println(sheep);
		System.out.println(sheep2);
		System.out.println(sheep3);
		System.out.println(sheep4);
		System.out.println(sheep5);
		//...
	}
}
