package com.zhaolearn.decorator.improve.coffee;


import com.zhaolearn.decorator.improve.Drink;

public class Coffee extends Drink {
	@Override
	public float cost() {
		return super.getPrice();
	}
}
