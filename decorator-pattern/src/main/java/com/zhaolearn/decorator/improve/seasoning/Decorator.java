package com.zhaolearn.decorator.improve.seasoning;


import com.zhaolearn.decorator.improve.Drink;

public class Decorator extends Drink {
	private Drink drink;
	public Decorator(Drink drink) { //组合
		this.drink = drink;
	}
	@Override
	public float cost() {
		// getPrice调品的价格+被装饰的价格
		return super.getPrice() + drink.cost();
	}
	@Override
	public String getName() {
		// drink.getName() 输出被装饰者的信息
		return super.getName() + " " + getPrice() + " && " + drink.getName();
	}
}
