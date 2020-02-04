package com.zhaolearn.template.hook;
/**
 *
 * 纯豆浆
 * @author: HeHaoZhao
 * @date: 2020/2/4 16:01
 */
public class PureSoyaMilk extends SoyaMilk{
	@Override
	void addCondiments() {
		//空实现
	}
	@Override
	boolean customerWantCondiments() {
		//意思是不需要添加配料
		return false;
	}
}