package com.zhaolearn.decorator.improve.seasoning;

import com.zhaolearn.decorator.improve.Drink;

//�����Decorator�� ������ǵ�ζƷ
public class Chocolate extends Decorator {
	public Chocolate(Drink drink) {
		super(drink);
		setName(" �ɿ��� ");
		setPrice(3.0f); // ��ζƷ �ļ۸�
	}
}
