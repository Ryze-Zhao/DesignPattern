package com.zhaolearn.command.improve;

public class RemoteController {
	// 开 按钮的命令数组(可以在构造方法内进行初始，也可以通过构造方法给入给入；；；目前是构造方法内初始)
	private Command[] onCommands;
	// 关 按钮的命令数组
	private Command[] offCommands;
	// 执行撤销的命令
	private Command undoCommand;
	// 构造器，完成对按钮初始化
	public RemoteController() {
		int amount=5;
		onCommands = new Command[amount];
		offCommands = new Command[amount];
		for (int i = 0; i < amount; i++) {
			onCommands[i] = new NoCommand();
			offCommands[i] = new NoCommand();
		}
	}
	// 给我们的按钮设置你需要的命令（也就是遥控器上面有一堆按钮，该方法就是将指定的命令绑定到指定按钮上）
	public void setCommand(int no, Command onCommand, Command offCommand) {
		onCommands[no] = onCommand;
		offCommands[no] = offCommand;
	}
	// 按下开按钮
	public void onButtonWasPushed(int no) { // no 0
		// 找到你按下的开的按钮， 并调用对应方法
		onCommands[no].execute();
		// 记录这次的操作，用于撤销
		undoCommand = onCommands[no];
	}

	// 按下关按钮
	public void offButtonWasPushed(int no) { // no 0
		// 找到你按下的关的按钮， 并调用对应方法
		offCommands[no].execute();
		// 记录这次的操作，用于撤销
		undoCommand = offCommands[no];
	}
	// 按下撤销按钮，即上一命令的相反
	public void undoButtonWasPushed() {
		undoCommand.undo();
	}
}
