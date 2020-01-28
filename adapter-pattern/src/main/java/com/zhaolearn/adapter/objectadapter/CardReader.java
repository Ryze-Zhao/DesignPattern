package com.zhaolearn.adapter.objectadapter;


//适配接口
public interface CardReader {
	/**
	 * 读卡器连接USB接口，并将电流降低至一半
	 */
	int sdConnectUSB();
}
