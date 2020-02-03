package com.zhaolearn.flyweight.improve;
/**
 *
 * 1    ChessmanFactory相当于FlyWeightFactory，即享元工厂类，用于构建一个池容器（集合），同时提供从池中获取对象方法
 * 2    Chessman相当于FlyWeight 是抽象的享元角色, 他是产品的抽象类, 同时定义出对象的外部状态（Coordinate）和内部状态(GoChessman) 的接口或实现
 * 3    GoChessman相当于 ConcreteFlyWeight 是具体的享元角色，是具体的产品类，实现抽象角色定义相关业务（内部状态指对象共享出来的信息，存储在享元对象内部且不会随环境的改变而改变）
 * 4    Coordinate相当于 UnSharedConcreteFlWeight 是不可共享的角色，一般不会出现在享元工厂。（外部状态指对象得以依赖的一个标记，是随环境改变而改变的、不可共享的状态。）
 *
 *
 *
 *
 *
 * @author: HeHaoZhao
 * @date: 2020/2/3 14:23
 */
public class DemoMain {
	public static void main(String[] args) {
		// 创建一个工厂类
		ChessmanFactory factory = new ChessmanFactory();

		Chessman blackGoChessman = factory.getGoChessman("黑色");
		blackGoChessman.setCoordinate(new Coordinate(1,2));

		Chessman whiteGoChessman = factory.getGoChessman("白色");
		whiteGoChessman.setCoordinate(new Coordinate(1,3));

		Chessman blackGoChessman1 = factory.getGoChessman("黑色");
		blackGoChessman1.setCoordinate(new Coordinate(3,2));

		Chessman whiteGoChessman1 = factory.getGoChessman("白色");
		whiteGoChessman1.setCoordinate(new Coordinate(4,3));

		System.out.println("棋子分类共=" + factory.getGoChessmanCount());
	}
}
