package com.zhaolearn.adapter.old;

/**
 * 读卡器B支持MMC
 */
public class CardReaderB implements CardReader {
    @Override
    public void connectSD(String name) {}  //不支持MMC
    @Override
    public void connectMMC(String name) { System.out.println("我支持MMC卡的读取。"); }
}
