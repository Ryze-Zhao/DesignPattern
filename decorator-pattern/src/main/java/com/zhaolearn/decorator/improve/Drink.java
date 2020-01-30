package com.zhaolearn.decorator.improve;


import lombok.Getter;
import lombok.Setter;
/**
 * 抽象构件（Component）：抽象类：Drink，所有装饰类和被装饰类都要直接或间接继承它，是具体构件和抽象装饰类的共同父类，
 * 声明了在具体构件中实现的业务方法，它的引入可以使客户端以一致的方式处理未被装饰的对象以及装饰之后的对象，实现客户端的透明操作。
 *
 * 也可以改为使用接口
 * @author: HeHaoZhao
 * @date: 2020/1/30 12:22
 */
@Getter
@Setter
public abstract class Drink {
	// 描述
	private String name;
	private float price = 0.0f;
	//计算费用的抽象方法
	//子类来实现
	public abstract float cost();
}
