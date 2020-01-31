package com.zhaolearn.compositeentity.improve;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/**
 * �޲ι��췽����ȫ�ι��췽����Get��Set
 *
 * @author: HeHaoZhao
 * @date: 2020/1/31 12:11
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class OrganizationComponent {
	private String name; // ����
	private String des; // ˵��
	protected  void add(OrganizationComponent organizationComponent) {
		//Ĭ��ʵ��
		throw new UnsupportedOperationException();
	}
	protected  void remove(OrganizationComponent organizationComponent) {
		//Ĭ��ʵ��
		throw new UnsupportedOperationException();
	}
	//����print, ���ɳ����, ���඼��Ҫʵ��
	protected abstract void print();
}
