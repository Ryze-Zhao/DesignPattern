package com.zhaolearn.proxy.dynamicjdk;

/**
 * 动态代理-JDK方式
 * 说明：
 * 		1	TicketInterface接口定义方法（ExtranetComputer要实现）
 * 		2	ExtranetComputer（外网电脑，被代理对象，目标对象）访问内网需要AccessGatewayProxy（堡垒机，代理对象）作为中转
 * 		3	AccessGatewayProxy（堡垒机，代理对象）
 * 注意：
 * 		代理类所在包:java.lang.reflect.Proxy；JDK实现代理只需要使用newProxyInstance方法,但是该方法需要接收三个参数,完整的写法是:static Object newProxyInstance(ClassLoader loader, Class<?>[]  interfaces,InvocationHandler h )
 *
 * @author: HeHaoZhao
 * @date: 2020/2/3 20:41
 */
public class DemoMain {
	public static void main(String[] args) {
		//创建目标对象(被代理对象)
		ExtranetComputer extranetComputer = new ExtranetComputer();

		//创建代理对象, 同时将被代理对象传递给代理对象
		AccessInterface accessGatewayProxy = (AccessInterface)new AccessGatewayProxy(extranetComputer).getProxyInstance();

		// proxyInstance=class com.sun.proxy.$Proxy0 内存中动态生成了代理对象
		System.out.println("accessGatewayProxy=" + accessGatewayProxy.getClass());

		//通过代理对象，调用目标对象的方法
		accessGatewayProxy.access("外网Zhao");
	}
}
