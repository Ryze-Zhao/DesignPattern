package com.zhaolearn.mediator.improve;

public class Curtains extends Colleague {
	public Curtains(Mediator mediator, String name) {
		super(mediator, name);
	}

	@Override
	public void sendMessage(int stateChange) {
		//调用的中介者对象的getMessage
		this.getMediator().getMessage(stateChange, this.name);
	}

	public void coloseCurtains() {
		System.out.println("正在关闭窗帘");
		sendMessage(0);
	}
}
