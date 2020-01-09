package com.zhaolearn.singleton.old.demo;


/**
 * 懒汉式，加synchronized，线程安全
 */
public class SingleClass2 {
    private static SingleClass2 single;
    //私有构造函数，不让外部实例化
    private SingleClass2() {}
    //获取唯一可用的对象
    public static synchronized SingleClass2 getInstance() {
        if (single == null) {
            single = new SingleClass2();
        }
        return single;
    }
    public void showMe() { System.out.println("I am Single！！！"); }
}
