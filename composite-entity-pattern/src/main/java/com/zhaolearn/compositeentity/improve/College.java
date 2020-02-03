package com.zhaolearn.compositeentity.improve;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

/**
 * College 就是 Composite , 可以管理Department
 * 无参构造方法、Get、Set
 *
 * @author: HeHaoZhao
 * @date: 2020/1/31 12:11
 */
@Getter
@Setter
@NoArgsConstructor
public class College extends OrganizationComponent {
	//List 中 存放的Department，因为其不是子叶点，所以需要有一个List
	private List<OrganizationComponent> organizationComponents=new ArrayList<>();

	//重写name和des构造器
	public College(String name, String des) {
		super(name, des);
	}

	// 重写add
	@Override
	protected void add(OrganizationComponent organizationComponent) {
		//  将来实际业务中，Colleage 的 add 和  University add 不一定完全一样
		organizationComponents.add(organizationComponent);
	}
	// 重写remove
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
