package com.zhaolearn.flyweight.improve;

import java.util.HashMap;

// ChessmanFactory是棋子工厂类，根据需要返回一个棋子
public class ChessmanFactory {
	//集合， 充当池的作用
	private HashMap<String, GoChessman> poolGoChessman = new HashMap<>();
	
	//根据棋子的类型，返回一个棋子, 如果没有就创建一个棋子，并放入到池中,并返回
	public Chessman getGoChessman(String color) {
		if(!poolGoChessman.containsKey(color)) {
			//就创建一个网站，并放入到池中
			poolGoChessman.put(color, new GoChessman(color));
		}
		return (Chessman)poolGoChessman.get(color);
	}
	
	//获取棋子的总数 (池中有多少个棋子类型)
	public int getGoChessmanCount() {
		return poolGoChessman.size();
	}
}
