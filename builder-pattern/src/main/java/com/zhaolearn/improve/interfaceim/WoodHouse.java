package com.zhaolearn.improve.interfaceim;

/**
 * 木屋
 *
 * @author: HeHaoZhao
 * @date: 2020/1/26 9:31
 */
public class WoodHouse implements HouseBuilder {
    private House house = new House();
    @Override
    public void buildBasic() {house.setBaise("木屋打地基");System.out.println("木屋打地基");}
    @Override
    public void buildWalls() {house.setWall("木屋砌墙");System.out.println("木屋砌墙");}
    @Override
    public void roofed() {house.setRoofed("木屋封顶");System.out.println("木屋封顶");}
    @Override
    public House createHouse() {return house;}
}