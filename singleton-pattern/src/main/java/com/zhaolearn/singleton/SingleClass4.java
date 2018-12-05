package com.zhaolearn.singleton;


/**
 * 双检锁/双重校验锁（DCL，即 double-checked locking）
 */
public class SingleClass4 {
    private static SingleClass4 single;
    //私有构造函数，不让外部实例化
    private SingleClass4() {}
    //获取唯一可用的对象
    public static synchronized SingleClass4 getInstance() {
        if (single == null) {
            synchronized (SingleClass4.class) {
                if (single == null) {
                    single = new SingleClass4();
                }
            }
        }
        return single;
    }
    public void showMe() { System.out.println("I am Single！！！"); }
}
