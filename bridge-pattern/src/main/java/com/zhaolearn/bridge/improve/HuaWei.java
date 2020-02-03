package com.zhaolearn.bridge.improve;

public class HuaWei implements Brand {
	@Override
	public void open() {System.out.println(" HuaWei手机开机 ");}
	@Override
	public void close() {System.out.println(" HuaWei手机关机 ");}
	@Override
	public void call() {System.out.println(" HuaWei手机打电话 ");}
}