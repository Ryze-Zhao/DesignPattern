package com.zhaolearn.improve.interfaceim;

/**
 * 抽象的建造者
 *
 * @author: HeHaoZhao
 * @date: 2020/1/26 10:07
 */
public interface HouseBuilder {
    //打地基
    void buildBasic();
    //砌墙
    void buildWalls();
    //封顶
    void roofed();
    House createHouse();
}
