package com.zhaolearn.deepclone;

public class Client {
	public static void main(String[] args) throws Exception {
		DeepSheep deepSheep= new DeepSheep("ԭ����",new DeepCattle("��ţ", 2));
		//��ʽ1 ������
		DeepSheep deepSheep1 = (DeepSheep) deepSheep.clone();
		System.out.println("��ʽһ��deepSheep.name=" + deepSheep.getName() +deepSheep.hashCode()+ "  deepSheep.deepCattle=" + deepSheep.getDeepCattle().hashCode());
		System.out.println("��ʽһ��deepSheep1.name=" + deepSheep1.getName() +deepSheep1.hashCode()+ "  deepSheep1.deepCattle=" + deepSheep1.getDeepCattle().hashCode());
		System.out.println("");

		//��ʽ2 ������
		DeepSheep deepSheep2 = (DeepSheep) deepSheep.deepClone();
		System.out.println("��ʽ����deepSheep.name=" + deepSheep.getName() +deepSheep.hashCode()+ "  deepSheep.deepCattle=" + deepSheep.getDeepCattle().hashCode());
		System.out.println("��ʽ����deepSheep2.name=" + deepSheep2.getName() +deepSheep2.hashCode()+ "  deepSheep2.deepCattle=" + deepSheep2.getDeepCattle().hashCode());
	}
}
