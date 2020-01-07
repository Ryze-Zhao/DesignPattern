package com.zhaolearn.improve;
/**
 * 1、本来Addition类的add与add10是用于求和的；
 * 2、但是由于错误（无意识的）地在Expand拓展类中，重写了Addition的add10方法，导致错误。
 * 3、最后结果就是父类使用子类进行替换后，不能正常使用，不符合里氏替换原则
 *
 *
 * 4、因此我们拆分出来更基础的父类，当然了，也可以去除上一节重写错误的方法。
 * @author: HeHaoZhao
 * @date: 2020/1/7 14:56
 */
public class Liskov {
	public static void main(String[] args) {
		Addition addition = new Addition();
		System.out.println("11+3=" + addition.add(11, 3));
		System.out.println("11+3+10=" + addition.add10(11, 3));
		System.out.println("-----------------------");
		Expand expand = new Expand();
		System.out.println("11+3=" + expand.add(11, 3));
		//这里本意是求出11+3+10
		System.out.println("11+3+10=" + expand.add10(11, 3));
		System.out.println("11+3+10-5=" + expand.func(11, 3));
	}
}
class Base {
	//把更加基础的方法和成员写到Base类
	// Addition加法类 返回两个数的和
	public int add(int num1, int num2) {return num1 + num2;}
}


class Addition extends Base{
	// Addition加法类 返回两个数与10的和
	public int add10(int num1, int num2) {return add(num1,num2)+10;}
}

class Expand extends Base {
	//如果Expand需要使用Addition类的方法,使用组合关系
	private Addition addition = new Addition();

	//我们仍然想使用A的方法
	public int add10(int num1, int num2) {return this.addition.add10(num1,num2);}

	public int func(int num1, int num2 ){return add10(num1, num2) - 5;}
}