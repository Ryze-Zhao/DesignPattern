package com.zhaolearn.mediator.improve;

import lombok.AllArgsConstructor;

public class CoffeeMachine extends Colleague {
	public CoffeeMachine(Mediator mediator, String name) {
		super(mediator, name);
	}

	@Override
	public void sendMessage(int stateChange) {
		//调用的中介者对象的getMessage
		this.getMediator().getMessage(stateChange, this.name);
	}

	public void startCoffee() {
		System.out.println("开始煮咖啡");
	}
	public void filishCoffee() {
		System.out.println("咖啡煮好了");
		sendMessage(0);
	}
}
