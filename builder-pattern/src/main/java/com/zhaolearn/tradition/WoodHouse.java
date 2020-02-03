package com.zhaolearn.tradition;

/**
 * 木屋
 *
 * @author: HeHaoZhao
 * @date: 2020/1/26 9:31
 */
public class WoodHouse extends AbstractHouse {
    @Override
    public void buildBasic() { System.out.println("木屋打地基 "); }
    @Override
    public void buildWalls() {
        System.out.println("木屋砌墙 ");
    }
    @Override
    public void roofed() {
        System.out.println("木屋封顶 ");
    }
}