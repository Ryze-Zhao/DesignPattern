package com.zhaolearn.visitor.improve;
/**
 *
 * 访问者
 *
 * @author: HeHaoZhao
 * @date: 2020/2/6 15:34
 */
public class ConcreteVisitorA implements Visitor {
    @Override
    public void visit(Element element) {
        System.out.println("具体访问者A访问-->"+element.operation());
    }
}
