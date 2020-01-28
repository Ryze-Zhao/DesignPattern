package com.zhaolearn.adapter.objectadapter;

/**
 * 对象适配器：
 * 我们需要令SD卡连接到电脑USB，但是无法直接连接，现实中我们会使用读卡器进行适配。（并且将电流从1A降低一半）
 * 对象适配器，相对于类适配器，便是将UsbAdapter继承ComputerUsb改为聚合ComputerUsb（实际聚合使用其接口即可ConnectorType）
 *
 *
 *
 * 过程：
 * 1、我们需要将SD卡连接至电脑的USB接口
 * 2、先建立一个ComputerUsb类，代表电脑提供的一个USB接口
 * 3、再建立一个读卡器接口（CardReader），并提供多种读卡器接口（如SD卡、MMC等）
 * 4、建立USB转换器类（UsbAdapter），实现读卡器接口（CardReader），并聚合ComputerUsb类，
 *
 * @author: HeHaoZhao
 * @date: 2020/1/28 15:15
 */
public class DemoMain{
	public static void main(String[] args) {
		System.out.println(" === 对象适配器模式 ====");
		SDCard sdCard = new SDCard();
		//对象适配器更改：这里切换使用构造器放入对象属性即可。
		sdCard.charging(new UsbAdapter(new ComputerUsb()));
	}
}
