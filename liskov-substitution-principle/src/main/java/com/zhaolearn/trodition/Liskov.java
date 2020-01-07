package com.zhaolearn.trodition;
/**
 * 1、本来Addition类的add与add10是用于求和的；
 * 2、但是由于错误（无意识的）地在Expand拓展类中，重写了Addition的add10方法，导致错误。
 * 3、最后结果就是父类使用子类进行替换后，不能正常使用，不符合里氏替换原则
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

class Addition {
	// Addition加法类 返回两个数的和
	public int add(int num1, int num2) {return num1 + num2;}
	// Addition加法类 返回两个数与10的和
	public int add10(int num1, int num2) {return add(num1,num2)+10;}
}
class Expand extends Addition {
	//Expand类继承了Addition,拓展了一个新功能：完成两个数求和,然后和5相减
	//这里，重写了Addition类的求和方法，改为了减法, 可能是无意识（代码多时极有可能发生）
	@Override
	public int add10(int num1, int num2) {return super.add(num1, num2)-10;}

	public int func(int num1, int num2 ){return add10(num1, num2) - 5;}
}