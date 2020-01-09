package com.zhaolearn.singleton.old.demo;

/**
 * 饿汉式
 */
public class SingleClass {
    //创建 com.zhaolearn.SingleClass
    private static SingleClass single = new SingleClass();
    //私有构造函数，不让外部实例化
    private SingleClass() {}
    //获取唯一可用的对象
    public static SingleClass getInstance() { return single; }
    public void showMe() { System.out.println("I am Single！！！"); }
}
