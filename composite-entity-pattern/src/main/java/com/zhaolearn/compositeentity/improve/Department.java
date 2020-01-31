package com.zhaolearn.compositeentity.improve;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/**
 * 无参构造方法、Get、Set
 *
 * @author: HeHaoZhao
 * @date: 2020/1/31 12:11
 */
@Getter
@Setter
@NoArgsConstructor
public class Department extends OrganizationComponent {
	//重写name和des构造器
	public Department(String name, String des) {
		super(name, des);
	}

	//子叶点不需要add , remove 和集合，因为他是叶子节点
	@Override
	protected void print() {
		System.out.println(getName());
	}
}
