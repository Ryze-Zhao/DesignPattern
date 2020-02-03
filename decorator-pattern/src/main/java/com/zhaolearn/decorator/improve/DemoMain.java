package com.zhaolearn.decorator.improve;

import com.zhaolearn.decorator.improve.coffee.DeCaf;
import com.zhaolearn.decorator.improve.coffee.LongBlack;
import com.zhaolearn.decorator.improve.seasoning.Chocolate;
import com.zhaolearn.decorator.improve.seasoning.Milk;

public class DemoMain {
	public static void main(String[] args) {
		// 装饰者模式下的订单：2份巧克力+一份牛奶的LongBlack
		// 1. 点一份 LongBlack
		Drink order = new LongBlack();
		System.out.println("费用1=" + order.cost());
		System.out.println("名字=" + order.getName());

		// 2. order 加入一份牛奶
		order = new Milk(order);
		System.out.println("order 加入一份牛奶 费用 =" + order.cost());
		System.out.println("order 加入一份牛奶 名字 = " + order.getName());

		// 3. order 加入一份巧克力
		order = new Chocolate(order);
		System.out.println("order 加入一份牛奶 加入一份巧克力  费用 =" + order.cost());
		System.out.println("order 加入一份牛奶 加入一份巧克力 名字 = " + order.getName());

		// 3. order 加入一份巧克力
		order = new Chocolate(order);
		System.out.println("order 加入一份牛奶 加入2份巧克力   费用 =" + order.cost());
		System.out.println("order 加入一份牛奶 加入2份巧克力 名字 = " + order.getName());
		System.out.println("===========================");

		Drink order2 = new DeCaf();
		System.out.println("order2 无因咖啡  费用 =" + order2.cost());
		System.out.println("order2 无因咖啡 名字 = " + order2.getName());
		
		order2 = new Milk(order2);
		System.out.println("order2 无因咖啡 加入一份牛奶  费用 =" + order2.cost());
		System.out.println("order2 无因咖啡 加入一份牛奶 名字 = " + order2.getName());
	}
}
