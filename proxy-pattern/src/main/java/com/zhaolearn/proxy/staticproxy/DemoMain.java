package com.zhaolearn.proxy.staticproxy;

/**
 * 静态代理方式
 * 说明：
 * 		1	TicketInterface接口定义方法（ExtranetComputer与AccessGatewayProxy都要实现）
 * 		2	ExtranetComputer（外网电脑，被代理对象，目标对象）访问内网需要AccessGatewayProxy（堡垒机，代理对象）作为中转
 * 		3	AccessGatewayProxy（堡垒机，代理对象）
 * 注意：
 * 		1	代理对象与目标对象要实现相同的接口,然后通过调用相同的方法来调用目标对象的方法
 *
 * @author: HeHaoZhao
 * @date: 2020/2/3 20:41
 */
public class DemoMain {
	public static void main(String[] args) {
		//创建目标对象(被代理对象)
		ExtranetComputer extranetComputer = new ExtranetComputer();

		//创建代理对象, 同时将被代理对象传递给代理对象
		AccessGatewayProxy accessGatewayProxy = new AccessGatewayProxy(extranetComputer);

		//通过代理对象，调用到被代理对象的方法
		//即：执行的是代理对象的方法，代理对象再去调用目标对象的方法
		accessGatewayProxy.access("外网Zhao");
	}
}
