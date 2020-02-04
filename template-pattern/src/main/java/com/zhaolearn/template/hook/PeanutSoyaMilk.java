package com.zhaolearn.template.hook;
/**
 * 花生豆浆
 * @author: HeHaoZhao
 * @date: 2020/2/4 16:01
 */
public class PeanutSoyaMilk extends SoyaMilk {

	@Override
	void addCondiments() {
		System.out.println(" 加入上好的花生 ");
	}

}
