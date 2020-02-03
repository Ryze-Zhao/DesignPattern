package com.zhaolearn.proxy.staticproxy;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

//代理对象,静态代理
@NoArgsConstructor
@AllArgsConstructor
public class AccessGatewayProxy implements AccessInterface{
	private AccessInterface target; // 目标对象，通过接口来聚合
	@Override
	public String access(String name) {
		System.out.println("开始静态代理  完成某些操作。。。。。 ");//方法
		String returnVal=target.access(name);
		System.out.println("提交。。。。。");//方法
		return returnVal;
	}
}
