package com.zhaolearn.adapter.old;

/**
 * 读卡器A支持SD
 */
public class CardReaderA implements CardReader {
    @Override
    public void connectSD(String name) {
        System.out.println("我支持SD卡的读取。");
    }
    @Override
    public void connectMMC(String name) {}  //不支持MMC
}
