package com.zhaolearn.adapter.old;

public class UsbAdapter implements ConnectorType{
    CardReader cardReader;

    public UsbAdapter(String connectType){
        if(connectType.equalsIgnoreCase("SD") ){
            cardReader = new CardReaderA();
        } else if (connectType.equalsIgnoreCase("MMC")){
            cardReader = new CardReaderB();
        }
    }
    @Override
    public void connect(String connectType, String name) {
        if(connectType.equalsIgnoreCase("SD")){
            cardReader.connectSD(name);
        }else if(connectType.equalsIgnoreCase("MMC")){
            cardReader.connectMMC(name);
        }
    }
}
