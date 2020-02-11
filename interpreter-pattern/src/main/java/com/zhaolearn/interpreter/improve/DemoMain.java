package com.zhaolearn.interpreter.improve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
/**
 *
 *
 * 须知：假如我们定义表达式为a+b，且数值定为a=10,b=20
 * 1、Expression抽象类中的interpreter作为解释公式与数值的，参数HashMap<String, Integer>，key为公式对应的字母，value为输入对应字母的数值，如我们定义的表达式与数值,那么这个HashMap{a=10,b=20}代表了字母与数值。
 * 2、VarExpression有key属性（通常记录了公式中的字母，如上边的a,b）；而它继承Expression抽象类并实现interpreter，只需从HashMap中取到指定key的数值即可。
 * 3、SymbolExpression用于一个记录运算符的左右两个数值的对象（这里声明为Expression，但通常使用的其实是子类VarExpression）；而它继承Expression抽象类并返回默认interpreter（因为这个方法，通常是由其子类（即具体运算符解释类）进行实现。）
 * 4、AddExpression加法运算符解释类（SymbolExpression的子类），重写SymbolExpression的interpreter，实现左右数值加法运算。
 * 5、SubExpression减法运算符解释类（SymbolExpression的子类），重写SymbolExpression的interpreter，实现左右数值减法运算。
 * 6、Calculator构造器，给入表达式，并转变为Expression；run方法是执行解释器。
 * 7、测试类：获取表达式、获取数值映射、并执行解释器。
 *
 *
 * Calculator只有一个Expression如何存表达式问题：由于使用的是SymbolExpression，其存有Expression left，Expression right
 * 1、如果表达式为a+b,那么left存a，right存b；
 * 2、如果表达式为a+b-c,那么left又会存了一个SymbolExpression，也会有left和right（这是分别为a，b），right会存c
 * 3、如果有多个就延展多个left即可。
 *
 *
 * @author: HeHaoZhao
 * @date: 2020/2/11 17:04
 */
public class DemoMain {
	public static void main(String[] args) throws IOException {
		String expStr = getExpStr(); // a+b
		HashMap<String, Integer> var = getValue(expStr);// var {a=10, b=20}
		Calculator calculator = new Calculator(expStr);
		System.out.println("运算结果：" + expStr + "=" + calculator.run(var));
	}

	// 获得表达式
	public static String getExpStr() throws IOException {
		System.out.print("请输入表达式：");
		return (new BufferedReader(new InputStreamReader(System.in))).readLine();
	}

	// 获得值映射
	public static HashMap<String, Integer> getValue(String expStr) throws IOException {
		HashMap<String, Integer> map = new HashMap<>();
		for (char ch : expStr.toCharArray()) {
			if (ch != '+' && ch != '-') {
				if (!map.containsKey(String.valueOf(ch))) {
					System.out.print("请输入" + String.valueOf(ch) + "的值：");
					String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
					map.put(String.valueOf(ch), Integer.valueOf(in));
				}
			}
		}
		return map;
	}
}
