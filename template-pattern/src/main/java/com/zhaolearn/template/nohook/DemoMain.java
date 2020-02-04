package com.zhaolearn.template.nohook;
/**
 *
 * 1、SoyaMilk定义模板方法，规定执行顺序
 * 2、PeanutSoyaMilk、RedBeanSoyaMilk继承并实现其中可变的步骤
 * 3、测试类调用即可
 *
 *
 *
 * @author: HeHaoZhao
 * @date: 2020/2/4 16:09
 */
public class DemoMain {
	public static void main(String[] args) {
		//制作红豆豆浆
		System.out.println("----制作红豆豆浆----");
		RedBeanSoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
		redBeanSoyaMilk.make();
		
		System.out.println("----制作花生豆浆----");
		PeanutSoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
		peanutSoyaMilk.make();
	}
}
