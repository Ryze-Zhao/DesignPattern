package com.zhaolearn.visitor.improve;
/**
 * 具体元素
 *
 * @author: HeHaoZhao
 * @date: 2020/2/6 15:34
 */
public class ConcreteElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    @Override
    public String operation() {
        return "具体元素B的操作。";
    }
}
