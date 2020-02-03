package com.zhaolearn.flyweight.improve;
/**
 *
 * 棋子抽象类，具体类型棋子（国际象棋，中国象棋，围棋等）由具体的子类实现
 * @return:
 * @author: HeHaoZhao
 * @date: 2020/2/3 14:48
 */
public abstract class Chessman {
	//抽象方法
	public abstract void setCoordinate(Coordinate coordinate);
}
