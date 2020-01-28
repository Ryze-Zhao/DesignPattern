package com.zhaolearn.adapter.old;

/**
 * 读卡器接口
 */
public interface CardReader {
    public void connectSD(String name);
    public void connectMMC(String name);
}
