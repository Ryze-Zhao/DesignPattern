package com.zhaolearn.adapter.objectadapter;

/**
 * Ŀ���ࣺSD��
 * @author: HeHaoZhao
 * @date: 2020/1/28 15:07
 */
public class SDCard {
	public void charging(UsbAdapter usbAdapter) {
		int electricCurrent= usbAdapter.sdConnectUSB();
		//����������������500mA���ſ�������ʹ�ã�������ǵĻ����Ͳ�����������
		if(electricCurrent == 500) {
			System.out.println("����Ϊ"+electricCurrent+"�ʺ�ʹ�ã�");
		} else {
			System.out.println("������Ϊ500mA��SD��������������");
		}
	}
}
