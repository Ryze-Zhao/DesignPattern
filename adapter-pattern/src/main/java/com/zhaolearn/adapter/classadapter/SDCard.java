package com.zhaolearn.adapter.classadapter;

/**
 * 目标类：SD卡
 * @author: HeHaoZhao
 * @date: 2020/1/28 15:07
 */
public class SDCard {
	public void charging(UsbAdapter usbAdapter) {
		int electricCurrent= usbAdapter.sdConnectUSB();
		//读卡器将电流降至500mA，才可以正常使用，如果不是的话，就不能正常工作
		if(electricCurrent == 500) {
			System.out.println("电流为"+electricCurrent+"适合使用！");
		} else {
			System.out.println("电流不为500mA，SD卡不能正常工作");
		}
	}
}
