package com.zhaolearn.adapter.interfaceadapter;

//在AbsAdapter 我们将 MyInterface 的方法进行默认实现
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
