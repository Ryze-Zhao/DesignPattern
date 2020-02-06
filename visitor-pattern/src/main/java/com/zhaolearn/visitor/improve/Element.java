package com.zhaolearn.visitor.improve;

/**
 * 元素接口
 *
 * @author: HeHaoZhao
 * @date: 2020/2/6 15:40
 */
public interface Element {
    void accept(Visitor visitor);
    String operation();
}
