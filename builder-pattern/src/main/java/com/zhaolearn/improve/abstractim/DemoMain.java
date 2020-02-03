package com.zhaolearn.improve.abstractim;
/**
 * 1、抽象类（HouseBuilder）先写明木屋和水泥屋共同的方法，以及创建方法，并存于house属性中；
 * 2、水泥屋（CementHouse）、木屋（WoodHouse）实现方法；
 * 3、创建指挥者（HouseDirector），用于指定制作流程，返回产品；
 * 4、测试类（DemoMain），直接创建需要的产品即可。
 *
 * @author: HeHaoZhao
 * @date: 2020/1/26 11:47
 */
public class DemoMain {
	public static void main(String[] args) {
		//准备创建房子的指挥者
		HouseDirector houseDirector = new HouseDirector();
		//完成盖房子，返回产品(普通房子)
		House house = houseDirector.constructHouse(new WoodHouse());

		System.out.println(house.toString());
		System.out.println("--------------------------");
		//重置建造者
		House house1 =houseDirector.constructHouse(new CementHouse());
		System.out.println(house1.toString());
	}
}
