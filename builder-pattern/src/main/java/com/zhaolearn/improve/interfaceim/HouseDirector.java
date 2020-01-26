package com.zhaolearn.improve.interfaceim;

//ָ���ߣ�����ȥָ���������̣����ز�Ʒ
public class HouseDirector {
	//��δ������췿�ӵ����̣�����ָ����
	public House constructHouse(HouseBuilder houseBuilder) {
		houseBuilder.buildBasic();
		houseBuilder.buildWalls();
		houseBuilder.roofed();
		return houseBuilder.createHouse();
	}
}