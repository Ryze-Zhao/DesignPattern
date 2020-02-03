package com.zhaolearn.flyweight.improve;
/**
 *
 * 1    ChessmanFactory�൱��FlyWeightFactory������Ԫ�����࣬���ڹ���һ�������������ϣ���ͬʱ�ṩ�ӳ��л�ȡ���󷽷�
 * 2    Chessman�൱��FlyWeight �ǳ������Ԫ��ɫ, ���ǲ�Ʒ�ĳ�����, ͬʱ�����������ⲿ״̬��Coordinate�����ڲ�״̬(GoChessman) �Ľӿڻ�ʵ��
 * 3    GoChessman�൱�� ConcreteFlyWeight �Ǿ������Ԫ��ɫ���Ǿ���Ĳ�Ʒ�࣬ʵ�ֳ����ɫ�������ҵ���ڲ�״ָ̬�������������Ϣ���洢����Ԫ�����ڲ��Ҳ����滷���ĸı���ı䣩
 * 4    Coordinate�൱�� UnSharedConcreteFlWeight �ǲ��ɹ���Ľ�ɫ��һ�㲻���������Ԫ���������ⲿ״ָ̬�������������һ����ǣ����滷���ı���ı�ġ����ɹ����״̬����
 *
 *
 *
 *
 *
 * @author: HeHaoZhao
 * @date: 2020/2/3 14:23
 */
public class DemoMain {
	public static void main(String[] args) {
		// ����һ��������
		ChessmanFactory factory = new ChessmanFactory();

		Chessman blackGoChessman = factory.getGoChessman("��ɫ");
		blackGoChessman.setCoordinate(new Coordinate(1,2));

		Chessman whiteGoChessman = factory.getGoChessman("��ɫ");
		whiteGoChessman.setCoordinate(new Coordinate(1,3));

		Chessman blackGoChessman1 = factory.getGoChessman("��ɫ");
		blackGoChessman1.setCoordinate(new Coordinate(3,2));

		Chessman whiteGoChessman1 = factory.getGoChessman("��ɫ");
		whiteGoChessman1.setCoordinate(new Coordinate(4,3));

		System.out.println("���ӷ��๲=" + factory.getGoChessmanCount());
	}
}
