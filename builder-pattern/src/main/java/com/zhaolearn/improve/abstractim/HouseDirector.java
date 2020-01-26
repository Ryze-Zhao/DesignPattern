package com.zhaolearn.improve.abstractim;

//指挥者，这里去指定制作流程，返回产品
public class HouseDirector {
	//如何处理建造房子的流程，交给指挥者
	public House constructHouse(HouseBuilder houseBuilder) {
		houseBuilder.buildBasic();
		houseBuilder.buildWalls();
		houseBuilder.roofed();
		return houseBuilder.createHouse();
	}
}
