package com.zhaolearn.improve.abstractim;

/**
 * 抽象的建造者
 *
 * @author: HeHaoZhao
 * @date: 2020/1/26 10:07
 */
public abstract class HouseBuilder {
    protected House house = new House();
    //将建造的流程写好, 抽象的方法
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();
    //建造房子好， 将产品(房子) 返回
    public House createHouse() {
        return house;
    }
}
