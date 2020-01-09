package com.zhaolearn.singleton.old.demo;


/**
 * 懒汉式，未加synchronized，线程不安全
 */
public class SingleClass1 {
    private static SingleClass1 single;
    //私有构造函数，不让外部实例化
    private SingleClass1() {}
    //获取唯一可用的对象
    public static SingleClass1 getInstance() {
        if (single == null) {
            single = new SingleClass1();
        }
        return single;
    }
    public void showMe() { System.out.println("I am Single！！！"); }
}
