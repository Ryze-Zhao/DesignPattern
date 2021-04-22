package com.zhaolearn.strategy.improve.duck;

import com.zhaolearn.strategy.improve.fly.GoodFlyBehavior;

public class WildDuck extends Duck {
	//构造器，传入FlyBehavor 的对象
	public WildDuck() {
		this.setFlyBehavior(new GoodFlyBehavior());
	}
	@Override
	public void display() {
		System.out.println("--------------野鸭--------------");
	}
}
