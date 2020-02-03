package com.zhaolearn.proxy.cglib;

/**
 * 动态代理-CGLIB方式
 * 说明：
 * 		1	ExtranetComputer（外网电脑，被代理对象，目标对象）访问内网需要AccessGatewayProxy（堡垒机，代理对象）作为中转
 * 		2	AccessGatewayProxy（堡垒机，代理对象）
 * 注意：
 * 		1.1    静态代理和JDK代理模式都要求目标对象是实现一个接口,但是有时候目标对象只是一个单独的对象,并没有实现任何的接口,这个时候可使用目标对象子类来实现代理-这就是Cglib代理
 * 		1.2    Cglib代理也叫作子类代理,它是在内存中构建一个子类对象从而实现对目标对象功能扩展,有些书也将Cglib代理归属到动态代理。
 * 		1.3    Cglib是一个强大的高性能的代码生成包,它可以在运行期扩展java类与实现java接口.它广泛的被许多AOP的框架使用,例如SpringAOP，实现方法拦截
 * 		1.4    在AOP编程中如何选择代理模式：
 * 		1.4.1    目标对象需要实现接口，用JDK代理
 * 		1.4.2    目标对象不需要实现接口，用Cglib代理
 * 		1.5    Cglib包的底层是通过使用字节码处理框架ASM来转换字节码并生成新的类
 * 		1.6    在内存中动态构建子类，注意代理的类不能为final，否则报错java.lang.IllegalArgumentException:
 *		1.7    目标对象的方法如果为final/static,那么就不会被拦截,即不会执行目标对象额外的业务方法。
 *
 * @author: HeHaoZhao
 * @date: 2020/2/3 20:41
 */
public class DemoMain {
	public static void main(String[] args) {
		//创建目标对象(被代理对象)
		ExtranetComputer extranetComputer = new ExtranetComputer();

		//获取到代理对象，并且将目标对象传递给代理对象
		ExtranetComputer proxyInstance = (ExtranetComputer)new AccessGatewayProxy(extranetComputer).getProxyInstance();

		// proxyInstance=class com.sun.proxy.$Proxy0 内存中动态生成了代理对象
		System.out.println("proxyInstance=" + proxyInstance.getClass());

		//执行代理对象的方法，触发intecept 方法，从而实现 对目标对象的调用
		String name = proxyInstance.access("外网Zhao");
		System.out.println("name=" + name);
	}
}
