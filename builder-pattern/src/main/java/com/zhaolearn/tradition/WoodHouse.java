package com.zhaolearn.tradition;

/**
 * Ä¾ÎÝ
 *
 * @author: HeHaoZhao
 * @date: 2020/1/26 9:31
 */
public class WoodHouse extends AbstractHouse {
    @Override
    public void buildBasic() { System.out.println("Ä¾ÎÝ´òµØ»ù "); }
    @Override
    public void buildWalls() {
        System.out.println("Ä¾ÎÝÆöÇ½ ");
    }
    @Override
    public void roofed() {
        System.out.println("Ä¾ÎÝ·â¶¥ ");
    }
}