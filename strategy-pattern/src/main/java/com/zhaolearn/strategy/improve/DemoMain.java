package com.zhaolearn.strategy.improve;

import com.zhaolearn.strategy.improve.duck.PekingDuck;
import com.zhaolearn.strategy.improve.duck.ToyDuck;
import com.zhaolearn.strategy.improve.duck.WildDuck;
import com.zhaolearn.strategy.improve.fly.NoFlyBehavior;

public class DemoMain {
	public static void main(String[] args) {
		WildDuck wildDuck = new WildDuck();
		wildDuck.display();
		wildDuck.fly();
		
		ToyDuck toyDuck = new ToyDuck();
		toyDuck.display();
		toyDuck.fly();
		
		PekingDuck pekingDuck = new PekingDuck();
		pekingDuck.display();
		pekingDuck.fly();
		
		//动态改变某个对象的行为, 北京鸭 不能飞
		pekingDuck.setFlyBehavior(new NoFlyBehavior());
		System.out.println("动态改变某个对象的行为：北京鸭的实际飞翔能力");
		pekingDuck.fly();
	}
}
