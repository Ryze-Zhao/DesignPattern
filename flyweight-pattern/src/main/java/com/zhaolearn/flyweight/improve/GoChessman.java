package com.zhaolearn.flyweight.improve;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 *
 * 具体为围棋类
 * @author: HeHaoZhao
 * @date: 2020/2/3 14:48
 */
@AllArgsConstructor
@NoArgsConstructor
public class GoChessman extends Chessman {
	//共享的部分，内部状态//棋子颜色
	private String color;
	@Override
	public void setCoordinate(Coordinate coordinate) {
		System.out.println("围棋颜色（内部状态）为:" + color + " 放在坐标(外部状态)为：X:" + coordinate.getX()+" Y:"+coordinate.getY());
	}
}
