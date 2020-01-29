package com.zhaolearn.bridge.improve;

/**
 * DemoMain：桥接模式的调用者
 * 抽象类（Phone）：维护了Implementor（接口：Brand），主要为其实现类（HuaWei，XiaoMi）二者是聚合关系（Phone聚合了Brand），而抽象类（Phone）作为桥接类
 * FoldedPhone、UpRightPhone作为抽象类（Phone）的抽象类子类
 * Brand：行为实现类的接口
 * FoldedPhone、UpRightPhone：行为的具体实现类
 *
 * @author: HeHaoZhao
 * @date: 2020/1/29 14:33
 */
public class DemoMain {
    public static void main(String[] args) {
        //获取折叠式手机 (样式 + 品牌 )
        Phone phone1 = new FoldedPhone(new XiaoMi());
        phone1.open();
        phone1.call();
        phone1.close();
        System.out.println("=======================");
        Phone phone2 = new FoldedPhone(new HuaWei());
        phone2.open();
        phone2.call();
        phone2.close();
        System.out.println("=======================");
        UpRightPhone phone3 = new UpRightPhone(new XiaoMi());
        phone3.open();
        phone3.call();
        phone3.close();
        System.out.println("=======================");
        UpRightPhone phone4 = new UpRightPhone(new HuaWei());
        phone4.open();
        phone4.call();
        phone4.close();
    }
}
