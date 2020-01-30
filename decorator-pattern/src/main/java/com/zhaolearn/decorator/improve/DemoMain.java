package com.zhaolearn.decorator.improve;

import com.zhaolearn.decorator.improve.coffee.DeCaf;
import com.zhaolearn.decorator.improve.coffee.LongBlack;
import com.zhaolearn.decorator.improve.seasoning.Chocolate;
import com.zhaolearn.decorator.improve.seasoning.Milk;

public class DemoMain {
	public static void main(String[] args) {
		// װ����ģʽ�µĶ�����2���ɿ���+һ��ţ�̵�LongBlack
		// 1. ��һ�� LongBlack
		Drink order = new LongBlack();
		System.out.println("����1=" + order.cost());
		System.out.println("����=" + order.getName());

		// 2. order ����һ��ţ��
		order = new Milk(order);
		System.out.println("order ����һ��ţ�� ���� =" + order.cost());
		System.out.println("order ����һ��ţ�� ���� = " + order.getName());

		// 3. order ����һ���ɿ���
		order = new Chocolate(order);
		System.out.println("order ����һ��ţ�� ����һ���ɿ���  ���� =" + order.cost());
		System.out.println("order ����һ��ţ�� ����һ���ɿ��� ���� = " + order.getName());

		// 3. order ����һ���ɿ���
		order = new Chocolate(order);
		System.out.println("order ����һ��ţ�� ����2���ɿ���   ���� =" + order.cost());
		System.out.println("order ����һ��ţ�� ����2���ɿ��� ���� = " + order.getName());
		System.out.println("===========================");

		Drink order2 = new DeCaf();
		System.out.println("order2 ���򿧷�  ���� =" + order2.cost());
		System.out.println("order2 ���򿧷� ���� = " + order2.getName());
		
		order2 = new Milk(order2);
		System.out.println("order2 ���򿧷� ����һ��ţ��  ���� =" + order2.cost());
		System.out.println("order2 ���򿧷� ����һ��ţ�� ���� = " + order2.getName());
	}
}
