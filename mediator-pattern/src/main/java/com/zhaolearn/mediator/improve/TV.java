package com.zhaolearn.mediator.improve;

public class TV extends Colleague {
	public TV(Mediator mediator, String name) {
		super(mediator, name);
	}

	@Override
	public void sendMessage(int stateChange) {
		//调用的中介者对象的getMessage
		this.getMediator().getMessage(stateChange, this.name);
	}

	public void startTv() {
		System.out.println("电视机正在开启");
	}

	public void motionPictures() {
		System.out.println("电视机正在开始播放");
	}
}
