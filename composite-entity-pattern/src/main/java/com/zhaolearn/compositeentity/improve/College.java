package com.zhaolearn.compositeentity.improve;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

/**
 * College ���� Composite , ���Թ���Department
 * �޲ι��췽����Get��Set
 *
 * @author: HeHaoZhao
 * @date: 2020/1/31 12:11
 */
@Getter
@Setter
@NoArgsConstructor
public class College extends OrganizationComponent {
	//List �� ��ŵ�Department����Ϊ�䲻����Ҷ�㣬������Ҫ��һ��List
	private List<OrganizationComponent> organizationComponents=new ArrayList<>();

	//��дname��des������
	public College(String name, String des) {
		super(name, des);
	}

	// ��дadd
	@Override
	protected void add(OrganizationComponent organizationComponent) {
		//  ����ʵ��ҵ���У�Colleage �� add ��  University add ��һ����ȫһ��
		organizationComponents.add(organizationComponent);
	}
	// ��дremove
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
