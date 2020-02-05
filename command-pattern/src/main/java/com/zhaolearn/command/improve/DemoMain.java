package com.zhaolearn.command.improve;
/**
 *
 * 1.1    LightReceiver是电灯，里面有开与关的方法
 * 1.2    Command接口定义了两个命令，分别为执行与撤销
 * 1.3    LightOnCommand实现Command的两接口，然后聚合  LightReceiver调用对应的命令
 * 1.4    LightOffCommand实现Command的两接口，然后聚合  LightReceiver调用对应的命令，与LightOnCommand的命令刚刚好相反即可。
 * 1.5    NoCommand是Command接口的空实现，方便初始化的。（当不需要初始化时可以去除）
 * 1.6    RemoteController记录命令，用于关联命令与调用方
 * 1.7    DemoMain初始化命令，并调用测试。
 *
 * @author: HeHaoZhao
 * @date: 2020/2/5 12:54
 */
public class DemoMain {
    public static void main(String[] args) {
        //使用命令设计模式，完成通过遥控器，对电灯的操作
        //创建电灯的对象(接受者)
        LightReceiver lightReceiver = new LightReceiver();
        //创建电灯相关的开关命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        //需要一个遥控器
        RemoteController remoteController = new RemoteController();

        //给我们的遥控器设置命令, 比如 no = 0 是电灯的开和关的操作
        remoteController.setCommand(0, lightOnCommand, lightOffCommand);

        System.out.println("--------按下灯的开按钮-----------");
        remoteController.onButtonWasPushed(0);
        System.out.println("--------按下灯的关按钮-----------");
        remoteController.offButtonWasPushed(0);
        System.out.println("--------按下撤销按钮-----------");
        remoteController.undoButtonWasPushed();










        System.out.println("=========使用遥控器操作电视机==========");
        TVReceiver tvReceiver = new TVReceiver();
        TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);
        TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);

        //给我们的遥控器设置命令, 比如 no = 1 是电视机的开和关的操作
        remoteController.setCommand(1, tvOnCommand, tvOffCommand);
        System.out.println("--------按下电视机的开按钮-----------");
        remoteController.onButtonWasPushed(1);
        System.out.println("--------按下电视机的关按钮-----------");
        remoteController.offButtonWasPushed(1);
        System.out.println("--------按下撤销按钮-----------");
        remoteController.undoButtonWasPushed();

    }

}
