package com.zhaolearn.memento.improve;
/**
 * 业务场景：
 * 	游戏根据当前时间进行存档的功能。
 *
 * 代码说明：
 * 	1、GameRole:对象(需要保存状态的对象)，游戏角色，假设里面有两个属性
 * 	2、Memento：备忘录对象,负责保存好记录，即GameRole内部状态
 * 	3、Caretaker:守护者对象,负责保存多个备忘录对象，使用集合管理，提高效率（每次存档，以时间为准，也可以通过给入名称保存）
 *
 * @author: HeHaoZhao
 * @date: 2020/2/11 12:22
 */
public class DemoMain {
	public static void main(String[] args) {
		//创建游戏角色
		GameRole gameRole = new GameRole();
		gameRole.setVit(100);
		gameRole.setDef(100);
		System.out.println("---------第一次存档前的状态---------");
		gameRole.display();
		
		//把当前状态保存caretaker
		Caretaker caretaker = new Caretaker();
		String key1 = caretaker.addMemento(gameRole.createMemento());

		System.out.println("---------第一次存档后，继续游戏后的状态---------");
		//模拟更改了数据
		gameRole.setDef(30);
		gameRole.setVit(30);
		gameRole.display();
		
		System.out.println("---------使用备忘录对象恢复到第一次存档，恢复后的状态---------");
		gameRole.recoverGameRoleFromMemento(caretaker.getMemento(key1));
		gameRole.display();
	}
}
