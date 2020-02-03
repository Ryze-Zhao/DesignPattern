package com.zhaolearn.proxy.staticproxy;




public class ExtranetComputer implements AccessInterface {
	@Override
	public String access(String name) {
		System.out.println("ExtranetComputer输出name："+name);
		return name;
	}
}
