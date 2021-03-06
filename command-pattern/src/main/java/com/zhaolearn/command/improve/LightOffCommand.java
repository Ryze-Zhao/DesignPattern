package com.zhaolearn.command.improve;

import lombok.AllArgsConstructor;
/**
 * LightOffCommand实现Command的两接口，然后聚合  LightReceiver调用对应的命令
 * execute代表其关灯，undo代表其反向操作，即开灯。
 *
 * 整个操作与LightOnCommand相反。
 * @author: HeHaoZhao
 * @date: 2020/2/5 12:57
 */
@AllArgsConstructor
public class LightOffCommand implements Command {
	// 聚合LightReceiver
	private LightReceiver light;
	@Override
	public void execute() {
		// 调用接收者的方法
		light.off();
	}
	@Override
	public void undo() {
		// 调用接收者的方法
		light.on();
	}
}
