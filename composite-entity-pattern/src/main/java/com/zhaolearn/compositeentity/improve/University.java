package com.zhaolearn.compositeentity.improve;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
/**
 * University ���� Composite , ���Թ���College
 * �޲ι��췽����Get��Set
 *
 * @author: HeHaoZhao
 * @date: 2020/1/31 12:11
 */
@Getter
@Setter
@NoArgsConstructor
public class University extends OrganizationComponent {
	private List<OrganizationComponent> organizationComponents=new ArrayList<>();
	//��дname��des������
	public University(String name, String des) {
		super(name, des);
	}

	// ����Ҷ��  Ҫ��дadd
	@Override
	protected void add(OrganizationComponent organizationComponent) {
		organizationComponents.add(organizationComponent);
	}

	// ����Ҷ��  ��дremove
	@Override
	protected void remove(OrganizationComponent organizationComponent) {
		organizationComponents.remove(organizationComponent);
	}
	// print�������������University ������ѧԺ
	@Override
	protected void print() {
		System.out.println("--------------" + getName() + "--------------");
		//���� organizationComponents 
		for (OrganizationComponent organizationComponent : organizationComponents) {
			organizationComponent.print();
		}
	}
}
