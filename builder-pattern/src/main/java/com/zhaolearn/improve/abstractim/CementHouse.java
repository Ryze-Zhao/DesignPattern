package com.zhaolearn.improve.abstractim;

/**
 * ˮ����
 * @author: HeHaoZhao
 * @date: 2020/1/26 9:31
 */
public class CementHouse extends HouseBuilder {
	@Override
	public void buildBasic() {house.setBaise("ˮ���ݴ�ػ�");System.out.println("ˮ���ݴ�ػ� ");}
	@Override
	public void buildWalls() {house.setWall("ˮ������ǽ");System.out.println("ˮ������ǽ ");}
	@Override
	public void roofed() { house.setRoofed("ˮ���ݷⶥ");System.out.println("ˮ���ݷⶥ ");}
	@Override
	public House createHouse() {
		return house;
	}
}
