package com.zhaolearn.singleton;


/**
 * 饿汉式，一开始实现的就是饿汉式
 */
public class SingleClass3 {
    private static SingleClass3 single=new SingleClass3();
    //私有构造函数，不让外部实例化
    private SingleClass3() {}
    //获取唯一可用的对象
    public static  SingleClass3 getInstance() {
        return single;
    }
    public void showMe() { System.out.println("I am Single！！！"); }
}
