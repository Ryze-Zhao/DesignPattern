package com.zhaolearn.compositeentity.improve;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/**
 * �޲ι��췽����Get��Set
 *
 * @author: HeHaoZhao
 * @date: 2020/1/31 12:11
 */
@Getter
@Setter
@NoArgsConstructor
public class Department extends OrganizationComponent {
	//��дname��des������
	public Department(String name, String des) {
		super(name, des);
	}

	//��Ҷ�㲻��Ҫadd , remove �ͼ��ϣ���Ϊ����Ҷ�ӽڵ�
	@Override
	protected void print() {
		System.out.println(getName());
	}
}
