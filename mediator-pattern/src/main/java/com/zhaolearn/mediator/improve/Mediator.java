package com.zhaolearn.mediator.improve;

public interface  Mediator {
	//将给中介者对象，加入到集合中
	void register(String colleagueName, Colleague colleague);
	//接收消息, 具体的同事对象发出
	void getMessage(int stateChange, String colleagueName);
	void sendMessage();
}
