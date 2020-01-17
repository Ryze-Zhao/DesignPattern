package com.zhaolearn.abstract_factory.factory;

import com.zhaolearn.abstract_factory.fruit.Fruit;
import com.zhaolearn.abstract_factory.outer_packaging.Packaging;

/**
 *
 * 1、新建一个接口
 * @author: HeHaoZhao
 * @date: 2020/1/17 14:03
 */
public interface IFactory {
    Fruit createFruit();
    Packaging giveMePackaging();
}


