package com.zhaolearn.mediator.improve;

//具体的同事类
public class Alarm extends Colleague {
	public Alarm(Mediator mediator, String name) {
		super(mediator, name);
	}

	@Override
	public void sendMessage(int stateChange) {
		//调用的中介者对象的getMessage
		this.getMediator().getMessage(stateChange, this.name);
	}

	public void sendAlarm(int stateChange) {
		sendMessage(stateChange);
	}
	public void closeAlarm() {
		System.out.println("关闭闹钟");
	}
}
