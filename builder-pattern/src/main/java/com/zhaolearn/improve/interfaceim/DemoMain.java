package com.zhaolearn.improve.interfaceim;
/**
 * 1���ӿڣ�HouseBuilder����д��ľ�ݺ�ˮ���ݹ�ͬ�ķ������Լ�����������
 * 2��ˮ���ݣ�CementHouse����ľ�ݣ�WoodHouse��ʵ�ַ�����������house������
 * 3������ָ���ߣ�HouseDirector��������ָ���������̣����ز�Ʒ
 * 4�������ࣨDemoMain����ֱ�Ӵ�����Ҫ�Ĳ�Ʒ���ɡ�
 *
 * @author: HeHaoZhao
 * @date: 2020/1/26 11:47
 */
public class DemoMain {
	public static void main(String[] args) {
		//׼���������ӵ�ָ����
		HouseDirector houseDirector = new HouseDirector();
		//��ɸǷ��ӣ����ز�Ʒ(��ͨ����)
		House house = houseDirector.constructHouse(new WoodHouse());

		System.out.println(house.toString());
		System.out.println("--------------------------");
		//���ý�����
		House house1 =houseDirector.constructHouse(new CementHouse());
		System.out.println(house1.toString());
	}
}
