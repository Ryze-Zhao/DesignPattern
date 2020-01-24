package com.zhaolearn.deepclone;

public class Client {
	public static void main(String[] args) throws Exception {
		DeepSheep deepSheep= new DeepSheep("原型羊",new DeepCattle("大牛", 2));
		//方式1 完成深拷贝
		DeepSheep deepSheep1 = (DeepSheep) deepSheep.clone();
		System.out.println("方式一：deepSheep.name=" + deepSheep.getName() +deepSheep.hashCode()+ "  deepSheep.deepCattle=" + deepSheep.getDeepCattle().hashCode());
		System.out.println("方式一：deepSheep1.name=" + deepSheep1.getName() +deepSheep1.hashCode()+ "  deepSheep1.deepCattle=" + deepSheep1.getDeepCattle().hashCode());
		System.out.println("");

		//方式2 完成深拷贝
		DeepSheep deepSheep2 = (DeepSheep) deepSheep.deepClone();
		System.out.println("方式二：deepSheep.name=" + deepSheep.getName() +deepSheep.hashCode()+ "  deepSheep.deepCattle=" + deepSheep.getDeepCattle().hashCode());
		System.out.println("方式二：deepSheep2.name=" + deepSheep2.getName() +deepSheep2.hashCode()+ "  deepSheep2.deepCattle=" + deepSheep2.getDeepCattle().hashCode());
	}
}
