package com.zhaolearn.decorator.improve.seasoning;

import com.zhaolearn.decorator.improve.Drink;

//具体的Decorator， 这里就是调味品
public class Chocolate extends Decorator {
	public Chocolate(Drink drink) {
		super(drink);
		setName(" 巧克力 ");
		setPrice(3.0f); // 调味品 的价格
	}
}
