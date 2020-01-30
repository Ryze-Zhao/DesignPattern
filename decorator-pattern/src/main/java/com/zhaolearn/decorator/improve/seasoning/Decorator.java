package com.zhaolearn.decorator.improve.seasoning;


import com.zhaolearn.decorator.improve.Drink;

public class Decorator extends Drink {
	private Drink drink;
	public Decorator(Drink drink) { //���
		this.drink = drink;
	}
	@Override
	public float cost() {
		// getPrice��Ʒ�ļ۸�+��װ�εļ۸�
		return super.getPrice() + drink.cost();
	}
	@Override
	public String getName() {
		// drink.getName() �����װ���ߵ���Ϣ
		return super.getName() + " " + getPrice() + " && " + drink.getName();
	}
}
