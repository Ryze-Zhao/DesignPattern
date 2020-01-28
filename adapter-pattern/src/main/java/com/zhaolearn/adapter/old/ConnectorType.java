package com.zhaolearn.adapter.old;

/**
 * 不同的接口方式，SD卡，MMC卡，USB
 */
public interface ConnectorType {
    public void connect(String connectType, String name);
}
