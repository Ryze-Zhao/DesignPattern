package com.zhaolearn.observer.improve;
/**
 *
 * 介绍：
 * 1	Observer接口，定义更新数据接口;
 * 2	Observer1、Observer2是具体观察者，都实现了Observer接口；
 * 3	Subject接口定义对观察者管理的接口；
 * 4	WeatherData是具体的管理实施类，并存有需要被观察的数据字段，当有更新时调用观察者更新方法。
 * @author: HeHaoZhao
 * @date: 2020/2/7 14:31
 */
public class DemoMain {
	public static void main(String[] args) {

		//创建一个WeatherData
		WeatherData weatherData = new WeatherData();
		
		//创建观察者
		Observer1 observer1 = new Observer1();
		Observer2 observer2 = new Observer2();
		
		//注册到weatherData
		weatherData.registerObserver(observer1);
		weatherData.registerObserver(observer2);
		
		//测试
		System.out.println("通知各个注册的观察者, 看看信息");
		weatherData.setData(10f, 100f, 30.3f);

		//测试去除某个观察者
		weatherData.removeObserver(observer1);
		System.out.println("------------------分割线-------------------");
		System.out.println("通知各个注册的观察者, 看看信息");
		weatherData.setData(11f, 10f, 37.3f);
	}
}
