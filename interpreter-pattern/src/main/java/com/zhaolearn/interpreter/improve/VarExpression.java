package com.zhaolearn.interpreter.improve;

import lombok.AllArgsConstructor;

import java.util.HashMap;


/**
 * 变量的解释器
 * @author Administrator
 *
 */
@AllArgsConstructor
public class VarExpression extends Expression {
	private String key; // key=a,key=b,key=c
	// var 就是{a=10, b=20}
	// interpreter 根据 变量名称，返回对应值
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		return var.get(this.key);
	}
}
