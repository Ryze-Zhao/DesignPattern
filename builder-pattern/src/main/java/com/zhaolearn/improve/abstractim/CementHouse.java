package com.zhaolearn.improve.abstractim;

/**
 * 水泥屋
 * @author: HeHaoZhao
 * @date: 2020/1/26 9:31
 */
public class CementHouse extends HouseBuilder {
	@Override
	public void buildBasic() {house.setBaise("水泥屋打地基");System.out.println("水泥屋打地基 ");}
	@Override
	public void buildWalls() {house.setWall("水泥屋砌墙");System.out.println("水泥屋砌墙 ");}
	@Override
	public void roofed() { house.setRoofed("水泥屋封顶");System.out.println("水泥屋封顶 ");}
	@Override
	public House createHouse() {
		return house;
	}
}
