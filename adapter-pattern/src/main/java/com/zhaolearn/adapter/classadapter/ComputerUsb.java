package com.zhaolearn.adapter.classadapter;

/**
 *
 * ��������ࣨ���Ե�USB��
 *
 * @author: HeHaoZhao
 * @date: 2020/1/28 15:48
 */
public class ComputerUsb implements ConnectorType{
	@Override
	public int provideUSB() {
		System.out.println("���ǵ��Զ����USB�ӿ�");
		//����USB�ӿڷ���1000mA
		return 1000;
	}
}
