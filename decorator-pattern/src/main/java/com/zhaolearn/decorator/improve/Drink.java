package com.zhaolearn.decorator.improve;


import lombok.Getter;
import lombok.Setter;
/**
 * ���󹹼���Component���������ࣺDrink������װ����ͱ�װ���඼Ҫֱ�ӻ��Ӽ̳������Ǿ��幹���ͳ���װ����Ĺ�ͬ���࣬
 * �������ھ��幹����ʵ�ֵ�ҵ�񷽷��������������ʹ�ͻ�����һ�µķ�ʽ����δ��װ�εĶ����Լ�װ��֮��Ķ���ʵ�ֿͻ��˵�͸��������
 *
 * Ҳ���Ը�Ϊʹ�ýӿ�
 * @author: HeHaoZhao
 * @date: 2020/1/30 12:22
 */
@Getter
@Setter
public abstract class Drink {
	// ����
	private String name;
	private float price = 0.0f;
	//������õĳ��󷽷�
	//������ʵ��
	public abstract float cost();
}
