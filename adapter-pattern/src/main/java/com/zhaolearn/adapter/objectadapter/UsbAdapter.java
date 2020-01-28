package com.zhaolearn.adapter.objectadapter;


/**
 * 适配器类（读卡器），进行适配操作。
 *
 * @author: HeHaoZhao
 * @date: 2020/1/28 16:11
 */
public class UsbAdapter implements CardReader {
    //对象适配器更改：这里使用接口的好处，毕竟以后可能不只一个。
    private ConnectorType connectorType;
    public UsbAdapter(ConnectorType connectorType) {
        this.connectorType = connectorType;
    }
    @Override
    public int sdConnectUSB() {
        //这里只是模拟实际电流降流。
        int electricCurrent = connectorType.provideUSB() / 2;
        System.out.println("读卡器连接至USB接口，并将电流降低为500mA");
        return electricCurrent;
    }
}
