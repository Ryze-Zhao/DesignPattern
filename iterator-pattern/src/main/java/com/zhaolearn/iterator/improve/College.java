package com.zhaolearn.iterator.improve;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Iterator;

/**
 * 学院
 * @author: HeHaoZhao
 * @date: 2020/2/6 20:48
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class College implements Container {
    private String name;
    private String des;
    private Department[] departments;

    @Override
    public Iterator createIterator() {
        return new CollegeIterator(departments);
    }
}
