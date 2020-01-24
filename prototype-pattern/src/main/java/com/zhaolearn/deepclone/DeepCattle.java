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
	//������
	public DeepCattle(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	//��Ϊ��������ԣ�����String , �����������ʹ��Ĭ�ϵ�clone��ɼ���
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
