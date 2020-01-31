package com.zhaolearn.compositeentity.improve;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/**
 * 无参构造方法、全参构造方法、Get、Set
 *
 * @author: HeHaoZhao
 * @date: 2020/1/31 12:11
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class OrganizationComponent {
	private String name; // 名字
	private String des; // 说明
	protected  void add(OrganizationComponent organizationComponent) {
		//默认实现
		throw new UnsupportedOperationException();
	}
	protected  void remove(OrganizationComponent organizationComponent) {
		//默认实现
		throw new UnsupportedOperationException();
	}
	//方法print, 做成抽象的, 子类都需要实现
	protected abstract void print();
}
