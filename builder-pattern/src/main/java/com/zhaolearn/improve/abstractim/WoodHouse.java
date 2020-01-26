package com.zhaolearn.improve.abstractim;

/**
 * ľ��
 *
 * @author: HeHaoZhao
 * @date: 2020/1/26 9:31
 */
public class WoodHouse extends HouseBuilder {
    @Override
    public void buildBasic() {house.setBaise("ľ�ݴ�ػ�"); System.out.println("ľ�ݴ�ػ�");}
    @Override
    public void buildWalls() {house.setWall("ľ����ǽ");System.out.println("ľ����ǽ");}
    @Override
    public void roofed() {house.setRoofed("ľ�ݷⶥ");System.out.println("ľ�ݷⶥ");}
    @Override
    public House createHouse() {
        return house;
    }
}