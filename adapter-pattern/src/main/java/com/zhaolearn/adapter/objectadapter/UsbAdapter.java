package com.zhaolearn.adapter.objectadapter;


/**
 * �������ࣨ�����������������������
 *
 * @author: HeHaoZhao
 * @date: 2020/1/28 16:11
 */
public class UsbAdapter implements CardReader {
    //�������������ģ�����ʹ�ýӿڵĺô����Ͼ��Ժ���ܲ�ֻһ����
    private ConnectorType connectorType;
    public UsbAdapter(ConnectorType connectorType) {
        this.connectorType = connectorType;
    }
    @Override
    public int sdConnectUSB() {
        //����ֻ��ģ��ʵ�ʵ���������
        int electricCurrent = connectorType.provideUSB() / 2;
        System.out.println("������������USB�ӿڣ�������������Ϊ500mA");
        return electricCurrent;
    }
}
