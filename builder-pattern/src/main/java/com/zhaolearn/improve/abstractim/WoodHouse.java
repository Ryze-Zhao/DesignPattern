package com.zhaolearn.improve.abstractim;

/**
 * Ä¾ÎÝ
 *
 * @author: HeHaoZhao
 * @date: 2020/1/26 9:31
 */
public class WoodHouse extends HouseBuilder {
    @Override
    public void buildBasic() {house.setBaise("Ä¾ÎÝ´òµØ»ù"); System.out.println("Ä¾ÎÝ´òµØ»ù");}
    @Override
    public void buildWalls() {house.setWall("Ä¾ÎÝÆöÇ½");System.out.println("Ä¾ÎÝÆöÇ½");}
    @Override
    public void roofed() {house.setRoofed("Ä¾ÎÝ·â¶¥");System.out.println("Ä¾ÎÝ·â¶¥");}
    @Override
    public House createHouse() {
        return house;
    }
}