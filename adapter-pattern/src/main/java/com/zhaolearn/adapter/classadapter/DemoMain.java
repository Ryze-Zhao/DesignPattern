package com.zhaolearn.adapter.classadapter;
/**
 * ����������
 * ������Ҫ��SD�����ӵ�����USB�������޷�ֱ�����ӣ���ʵ�����ǻ�ʹ�ö������������䡣�����ҽ�������1A����һ�룩
 *
 *
 *
 * ���̣�
 * 1��������Ҫ��SD�����������Ե�USB�ӿ�
 * 2���Ƚ���һ��ComputerUsb�࣬��������ṩ��һ��USB�ӿ�
 * 3���ٽ���һ���������ӿڣ�CardReader�������ṩ���ֶ������ӿڣ���SD����MMC�ȣ�
 * 4������USBת�����ࣨUsbAdapter�����̳�ComputerUsb�࣬��ʵ�ֶ������ӿڣ�CardReader��
 *
 * @author: HeHaoZhao
 * @date: 2020/1/28 15:15
 */
public class DemoMain{
	public static void main(String[] args) {
		System.out.println(" === ��������ģʽ ====");
		SDCard sdCard = new SDCard();
		sdCard.charging(new UsbAdapter());
	}
}
