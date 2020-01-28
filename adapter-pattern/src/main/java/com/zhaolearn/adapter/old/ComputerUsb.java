package com.zhaolearn.adapter.old;

public class ComputerUsb implements  ConnectorType{
    UsbAdapter usbAdapter;
    @Override
    public void connect(String connectType, String name) {
        //直接使用USB接口
        if(connectType.equalsIgnoreCase("usb")){
            System.out.println("我支持USB的接口读取。");
        }
        //使用对应的内存卡（适配器）读取
        else if(connectType.equalsIgnoreCase("SD")
                || connectType.equalsIgnoreCase("MMC")){
            usbAdapter = new UsbAdapter(connectType);
            usbAdapter.connect(connectType,name);
        }
        else{
            System.out.println("不支持的接口类型： "+ connectType);
        }
    }
}
