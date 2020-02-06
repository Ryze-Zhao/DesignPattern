package com.zhaolearn.visitor.improve;
/**
 * Element定义元素，而其实现类作出实现（建议元素为不可变部分，因为元素的改变和增加会导致全局所有访问者改变）
 * Visitor定义观察者，其实现类为观察者。
 *
 *
 * 例子：
 *   一公园有园区A和园区B（元素），而有领导A与领导B（访问者）于不同时间访问，他们都要访问园区A和园区B，若这时有领导C，只需要添加领导C即可访问。
 *
 * @author: HeHaoZhao
 * @date: 2020/2/6 16:16
 */
public class DemoMain {
    public static void main(String[] args) {
        ObjectStructure os = new ObjectStructure();

        //具体元素A的操作。
        ConcreteElementA concreteElementA = new ConcreteElementA();
        //具体元素B的操作。
        ConcreteElementB concreteElementB = new ConcreteElementB();

        os.add(concreteElementA);
        os.add(concreteElementB);

        //具体访问者A
        ConcreteVisitorA visitor = new ConcreteVisitorA();
        os.accept(visitor);


        System.out.println("------------------------------");
        //具体访问者B，去除元素B操作
        ConcreteVisitorB concreteVisitorB = new ConcreteVisitorB();
        os.accept(concreteVisitorB);

        System.out.println("------------------------------");
        //具体访问者C
        ConcreteVisitorC concreteVisitorC = new ConcreteVisitorC();
        os.accept(concreteVisitorC);

    }
}
