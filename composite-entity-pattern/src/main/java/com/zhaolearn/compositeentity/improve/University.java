package com.zhaolearn.compositeentity.improve;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
/**
 * University 就是 Composite , 可以管理College
 * 无参构造方法、Get、Set
 *
 * @author: HeHaoZhao
 * @date: 2020/1/31 12:11
 */
@Getter
@Setter
@NoArgsConstructor
public class University extends OrganizationComponent {
	private List<OrganizationComponent> organizationComponents=new ArrayList<>();
	//重写name和des构造器
	public University(String name, String des) {
		super(name, des);
	}

	// 非子叶点  要重写add
	@Override
	protected void add(OrganizationComponent organizationComponent) {
		organizationComponents.add(organizationComponent);
	}

	// 非子叶点  重写remove
	@Override
	protected void remove(OrganizationComponent organizationComponent) {
		organizationComponents.remove(organizationComponent);
	}
	// print方法，就是输出University 包含的学院
	@Override
	protected void print() {
		System.out.println("--------------" + getName() + "--------------");
		//遍历 organizationComponents 
		for (OrganizationComponent organizationComponent : organizationComponents) {
			organizationComponent.print();
		}
	}
}
