package com.zhaolearn.adapter.classadapter;
/**
 * 类适配器：
 * 我们需要令SD卡连接到电脑USB，但是无法直接连接，现实中我们会使用读卡器进行适配。（并且将电流从1A降低一半）
 *
 *
 *
 * 过程：
 * 1、我们需要将SD卡连接至电脑的USB接口
 * 2、先建立一个ComputerUsb类，代表电脑提供的一个USB接口
 * 3、再建立一个读卡器接口（CardReader），并提供多种读卡器接口（如SD卡、MMC等）
 * 4、建立USB转换器类（UsbAdapter），继承ComputerUsb类，并实现读卡器接口（CardReader）
 *
 * @author: HeHaoZhao
 * @date: 2020/1/28 15:15
 */
public class DemoMain{
	public static void main(String[] args) {
		System.out.println(" === 类适配器模式 ====");
		SDCard sdCard = new SDCard();
		sdCard.charging(new UsbAdapter());
	}
}
