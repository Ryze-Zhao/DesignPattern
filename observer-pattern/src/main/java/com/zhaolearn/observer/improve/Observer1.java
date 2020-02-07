package com.zhaolearn.observer.improve;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Observer1 implements Observer {
	// 温度，气压，湿度
	private float temperature;
	private float pressure;
	private float humidity;

	// 更新 天气情况，是由 WeatherData 来调用
	@Override
	public void update(float temperature, float pressure, float humidity) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		display();
	}

	// 显示
	public void display() {
		System.out.println("===Observer1====");
		System.out.println("***Observer1 气温 : " + temperature + "***");
		System.out.println("***Observer1 气压: " + pressure + "***");
		System.out.println("***Observer1 湿度: " + humidity + "***");
	}
}
