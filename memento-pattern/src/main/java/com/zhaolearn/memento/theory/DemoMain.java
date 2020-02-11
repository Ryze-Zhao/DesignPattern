package com.zhaolearn.memento.theory;


/**
 * originator:对象(需要保存状态的对象)
 * Memento：备忘录对象,负责保存好记录，即Originator内部状态
 * Caretaker:守护者对象,负责保存多个备忘录对象，使用集合管理，提高效率
 * 说明：如果希望保存多个originator对象的不同时间的状态，也可以使用HashMap<String,集合>
 *
 *
 *
 *
 *
 *
 *
 *
 * @author: HeHaoZhao
 * @date: 2020/2/11 11:56
 */
public class DemoMain {

	public static void main(String[] args) {
		Originator originator = new Originator();
		Caretaker careTaker = new Caretaker();
		originator.setState("状态1");
		careTaker.add(originator.saveStateMemento());
		originator.setState("状态2");
		careTaker.add(originator.saveStateMemento());
		originator.setState("状态3");
		careTaker.add(originator.saveStateMemento());
		originator.setState("状态4");
		System.out.println("当前状态: " + originator.getState());
		//希望得到状态 1, 将 originator 恢复到状态1
		originator.getStateFromMemento(careTaker.get(0));
		System.out.println("回归到第一次保存状态: " + originator.getState());
		//希望得到状态 2, 将 originator 恢复到状态1
		originator.getStateFromMemento(careTaker.get(1));
		System.out.println("回归到第二次保存状态: " + originator.getState());
	}

}
