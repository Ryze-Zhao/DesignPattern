package com.zhaolearn.decorator.improve.seasoning;

import com.zhaolearn.decorator.improve.Drink;

public class Soy extends Decorator {
	public Soy(Drink drink) {
		super(drink);
        setName(" 豆浆  ");
        setPrice(1.5f);
	}
}
