package com.zhaolearn.strategy.improve.duck;


import com.zhaolearn.strategy.improve.fly.FlyBehavior;
import com.zhaolearn.strategy.improve.quack.QuackBehavior;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
public abstract class Duck {
	//属性, 策略接口
	private FlyBehavior flyBehavior;
	//其它属性<->策略接口
	private QuackBehavior quackBehavior;

	//显示鸭子信息
	public abstract void display();
	//鸭子叫
	public void quack() {
		if(quackBehavior != null) {
			quackBehavior.quack();
		}
	}
	//鸭子飞
	public void fly() {
		//改进
		if(flyBehavior != null) {
			flyBehavior.fly();
		}
	}
}
