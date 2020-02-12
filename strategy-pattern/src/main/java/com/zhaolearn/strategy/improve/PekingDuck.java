package com.zhaolearn.strategy.improve;

public class PekingDuck extends Duck {
	//假如北京鸭可以飞翔，但是飞翔技术一般
	public PekingDuck() {
		this.setFlyBehavior(new BadFlyBehavior());
	}
	@Override
	public void display() {
		System.out.println("--------------北京鸭--------------");
	}
}
