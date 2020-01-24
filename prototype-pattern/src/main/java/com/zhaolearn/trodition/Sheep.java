package com.zhaolearn.trodition;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
public class Sheep {
	private String name;
	public Sheep(String name) {
		this.name = name;
	}
}
