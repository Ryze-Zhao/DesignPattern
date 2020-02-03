package com.zhaolearn.adapter.classadapter;

/**
 *
 * 被适配的类（电脑的USB）
 *
 * @author: HeHaoZhao
 * @date: 2020/1/28 15:48
 */
public class ComputerUsb implements ConnectorType{
	@Override
	public int provideUSB() {
		System.out.println("这是电脑对外的USB接口");
		//电脑USB接口返回1000mA
		return 1000;
	}
}
