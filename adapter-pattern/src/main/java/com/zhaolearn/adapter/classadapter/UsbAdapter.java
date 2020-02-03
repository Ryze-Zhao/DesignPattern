package com.zhaolearn.adapter.classadapter;


/**
 * 适配器类（读卡器），进行适配操作。
 *
 * @author: HeHaoZhao
 * @date: 2020/1/28 16:11
 */
public class UsbAdapter extends ComputerUsb implements CardReader {
    @Override
    public int sdConnectUSB() {
        //这里只是模拟实际电流降流。
        int electricCurrent = super.provideUSB() / 2;
        System.out.println("读卡器连接至USB接口，并将电流降低为500mA");
        return electricCurrent;
    }
}
