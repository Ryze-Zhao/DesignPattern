package com.zhaolearn.tradition;

/**
 * ľ��
 *
 * @author: HeHaoZhao
 * @date: 2020/1/26 9:31
 */
public class WoodHouse extends AbstractHouse {
    @Override
    public void buildBasic() { System.out.println("ľ�ݴ�ػ� "); }
    @Override
    public void buildWalls() {
        System.out.println("ľ����ǽ ");
    }
    @Override
    public void roofed() {
        System.out.println("ľ�ݷⶥ ");
    }
}