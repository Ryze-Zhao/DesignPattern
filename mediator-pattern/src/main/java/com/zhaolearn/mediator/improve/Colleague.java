package com.zhaolearn.mediator.improve;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//同事抽象类
@Setter
@Getter
@NoArgsConstructor
public abstract class Colleague {
	private Mediator mediator;
	public String name;

	public Colleague(Mediator mediator, String name) {
		this.mediator = mediator;
		this.name = name;
		//在创建Alarm 同事对象时，将自己放入到ConcreteMediator 对象中[集合],不然就需要在外面调用mediator放入
		mediator.register(name, this);
	}

	public abstract void sendMessage(int stateChange);
}
