package com.zhaolearn.tradition;
/**
 * 水泥屋
 * @author: HeHaoZhao
 * @date: 2020/1/26 9:31
 */
public class CementHouse extends AbstractHouse {
	@Override
	public void buildBasic() {System.out.println("水泥屋打地基 ");}
	@Override
	public void buildWalls() {System.out.println("水泥屋砌墙 ");}
	@Override
	public void roofed() {System.out.println("水泥屋封顶 ");}
}
