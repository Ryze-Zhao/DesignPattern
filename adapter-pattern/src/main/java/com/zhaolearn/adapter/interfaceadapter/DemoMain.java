package com.zhaolearn.adapter.interfaceadapter;
/**
 * 接口适配器
 *
 *
 * 过程：
 * 1、我们自己的接口（MyInterface）有方法1，2，3，4
 * 2、但是我们只要部分方法，因此需要有个抽象类作为接口适配器（AbsAdapter）
 *
 * 注：JDK8后，其实接口可以使用 default 作为默认方法，从而可以规避掉不需要的接口
 *
 * @author: HeHaoZhao
 * @date: 2020/1/28 17:45
 */
public class DemoMain {
	public static void main(String[] args) {
		AbsAdapter absAdapter = new AbsAdapter() {
			//只需要去覆盖我们 需要使用 接口方法
			@Override
			public void m1() {
				System.out.println("使用了m1的方法");
			}
		};
		absAdapter.m1();
	}
}
