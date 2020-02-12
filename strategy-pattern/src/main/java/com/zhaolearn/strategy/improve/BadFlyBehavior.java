package com.zhaolearn.strategy.improve;

public class BadFlyBehavior implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println(" 飞得一般 ");
	}
}
