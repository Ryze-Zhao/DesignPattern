package com.zhaolearn.flyweight.improve;

import java.util.HashMap;

// ChessmanFactory�����ӹ����࣬������Ҫ����һ������
public class ChessmanFactory {
	//���ϣ� �䵱�ص�����
	private HashMap<String, GoChessman> poolGoChessman = new HashMap<>();
	
	//�������ӵ����ͣ�����һ������, ���û�оʹ���һ�����ӣ������뵽����,������
	public Chessman getGoChessman(String color) {
		if(!poolGoChessman.containsKey(color)) {
			//�ʹ���һ����վ�������뵽����
			poolGoChessman.put(color, new GoChessman(color));
		}
		return (Chessman)poolGoChessman.get(color);
	}
	
	//��ȡ���ӵ����� (�����ж��ٸ���������)
	public int getGoChessmanCount() {
		return poolGoChessman.size();
	}
}
