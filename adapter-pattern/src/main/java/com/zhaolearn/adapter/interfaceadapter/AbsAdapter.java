package com.zhaolearn.adapter.interfaceadapter;

//��AbsAdapter ���ǽ� MyInterface �ķ�������Ĭ��ʵ��
public abstract class AbsAdapter implements MyInterface {
	@Override
	public void m1() {
		System.out.println("AbsAdapter:m1");
	}
	@Override
	public void m2() {
		System.out.println("AbsAdapter:m2");
	}
	@Override
	public void m3() {
		System.out.println("AbsAdapter:m3");
	}
	@Override
	public void m4() {
		System.out.println("AbsAdapter:m4");
	}
}
