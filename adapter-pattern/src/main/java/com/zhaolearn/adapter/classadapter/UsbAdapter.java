package com.zhaolearn.adapter.classadapter;


/**
 * �������ࣨ�����������������������
 *
 * @author: HeHaoZhao
 * @date: 2020/1/28 16:11
 */
public class UsbAdapter extends ComputerUsb implements CardReader {
    @Override
    public int sdConnectUSB() {
        //����ֻ��ģ��ʵ�ʵ���������
        int electricCurrent = super.provideUSB() / 2;
        System.out.println("������������USB�ӿڣ�������������Ϊ500mA");
        return electricCurrent;
    }
}
