package com.zhaolearn.flyweight.improve;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 *
 * ����ΪΧ����
 * @author: HeHaoZhao
 * @date: 2020/2/3 14:48
 */
@AllArgsConstructor
@NoArgsConstructor
public class GoChessman extends Chessman {
	//����Ĳ��֣��ڲ�״̬//������ɫ
	private String color;
	@Override
	public void setCoordinate(Coordinate coordinate) {
		System.out.println("Χ����ɫ���ڲ�״̬��Ϊ:" + color + " ��������(�ⲿ״̬)Ϊ��X:" + coordinate.getX()+" Y:"+coordinate.getY());
	}
}
