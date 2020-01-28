package com.zhaolearn.adapter.objectadapter;

/**
 * ������������
 * ������Ҫ��SD�����ӵ�����USB�������޷�ֱ�����ӣ���ʵ�����ǻ�ʹ�ö������������䡣�����ҽ�������1A����һ�룩
 * ������������������������������ǽ�UsbAdapter�̳�ComputerUsb��Ϊ�ۺ�ComputerUsb��ʵ�ʾۺ�ʹ����ӿڼ���ConnectorType��
 *
 *
 *
 * ���̣�
 * 1��������Ҫ��SD�����������Ե�USB�ӿ�
 * 2���Ƚ���һ��ComputerUsb�࣬��������ṩ��һ��USB�ӿ�
 * 3���ٽ���һ���������ӿڣ�CardReader�������ṩ���ֶ������ӿڣ���SD����MMC�ȣ�
 * 4������USBת�����ࣨUsbAdapter����ʵ�ֶ������ӿڣ�CardReader�������ۺ�ComputerUsb�࣬
 *
 * @author: HeHaoZhao
 * @date: 2020/1/28 15:15
 */
public class DemoMain{
	public static void main(String[] args) {
		System.out.println(" === ����������ģʽ ====");
		SDCard sdCard = new SDCard();
		//�������������ģ������л�ʹ�ù���������������Լ��ɡ�
		sdCard.charging(new UsbAdapter(new ComputerUsb()));
	}
}
