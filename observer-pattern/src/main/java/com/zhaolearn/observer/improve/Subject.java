package com.zhaolearn.observer.improve;

/**
 *
 * 接口, 让WeatherData 来实现
 * registerObserver注册一个观察者
 * removeObserver移除一个观察者
 * notifyObservers通知所有观察者
 * @author: HeHaoZhao
 * @date: 2020/2/7 14:14
 */
public interface Subject {
	 void registerObserver(Observer o);
	 void removeObserver(Observer o);
	 void notifyObservers();
}
