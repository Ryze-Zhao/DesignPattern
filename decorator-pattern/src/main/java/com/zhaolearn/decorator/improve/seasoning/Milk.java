package com.zhaolearn.decorator.improve.seasoning;


import com.zhaolearn.decorator.improve.Drink;

public class Milk extends Decorator {
	public Milk(Drink drink) {
		super(drink);
		setName(" еёдл ");
		setPrice(2.0f);
	}
}
