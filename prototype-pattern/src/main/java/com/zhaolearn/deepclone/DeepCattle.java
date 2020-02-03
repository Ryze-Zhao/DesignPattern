package com.zhaolearn.deepclone;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.io.Serializable;
@Getter
@Setter
@ToString
public class DeepCattle implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;
	private String name;
	private Integer age;
	//构造器
	public DeepCattle(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	//因为该类的属性，都是String , 因此我们这里使用默认的clone完成即可
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
