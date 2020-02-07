package com.zhaolearn.observer.improve;

/**
 * 观察者接口，有观察者来实现
 * 提供更新数据接口
 * @author: HeHaoZhao
 * @date: 2020/2/7 14:15
 */
public interface Observer {
	void update(float temperature, float pressure, float humidity);
}
