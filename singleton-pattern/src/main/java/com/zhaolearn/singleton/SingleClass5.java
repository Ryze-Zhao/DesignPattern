package com.zhaolearn.singleton;


/**
 * 登记式/静态内部类
 */
public class SingleClass5 {
    private static class SingletonHolder {
        private static final SingleClass5 INSTANCE = new SingleClass5();
    }
    private SingleClass5 (){}
    public static final SingleClass5 getInstance() {
        return SingletonHolder.INSTANCE;
    }
    public void showMe() { System.out.println("I am Single！！！"); }
}
