package com.zhaolearn.facade.improve;

/**
 *组建一个家庭影院：
 * DVD播放器、投影仪、自动屏幕、环绕立体声、爆米花机,要求完成使用家庭影院的 功能，其过程为：直接用遥控器：统筹各设备开关、开爆米花机、放下屏幕、开投影仪、开音响、开DVD，选dvd、去拿爆米花、调暗灯光、播放、观影结束后，关闭各种设备
 *
 * @author: HeHaoZhao
 * @date: 2020/1/31 19:32
 */
public class DemoMain{
	public static void main(String[] args) {
		//这里直接调用各类DVDPlayer、Popcorn、Projector、Screen、Stereo、TheaterLight等比较麻烦，因此需要使用HomeTheaterFacade外观类
		HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
		System.out.println("---------准备放映--------");
		homeTheaterFacade.ready();
		System.out.println("---------开始放映--------");
		homeTheaterFacade.play();
		System.out.println("---------停止放映--------");
		homeTheaterFacade.end();
	}
}
