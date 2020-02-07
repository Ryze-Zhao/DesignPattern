package com.zhaolearn.mediator.improve;
/**
 * 业务场景流程：
 * 1、闹钟响起来，通知电视开机，窗帘关上；
 * 2、窗帘关上后，通知咖啡机煮咖啡，电视开始播电影；
 * 3、当咖啡煮好后，关闭闹钟
 *
 * 代码说明：
 * 	1、新建中介者mediator；
 * 	2、新建Alarm\CoffeeMachine\Curtains\TV，其中创建时由于Colleague抽象类会将对象注册到中介者mediator中；
 *	3、如果各部件（Alarm\CoffeeMachine\Curtains\TV）需要发消息，会通过聚合在内部的Mediator，进行及状态访问mediator中的getMessage方法
 *	4、mediator中的getMessage方法会进行处理，并按要求访问对应的数据。
 *
 * @author: HeHaoZhao
 * @date: 2020/2/7 17:08
 */
public class DemoMain {
    public static void main(String[] args) {
        //创建一个中介者对象
        Mediator mediator = new ConcreteMediator();

        //创建Alarm 并且加入到  ConcreteMediator 对象的HashMap
        Alarm alarm = new Alarm(mediator, "alarm");
        //创建了CoffeeMachine 对象，并  且加入到  ConcreteMediator 对象的HashMap
        CoffeeMachine coffeeMachine = new CoffeeMachine(mediator, "coffeeMachine");
		//创建 Curtains , 并  且加入到  ConcreteMediator 对象的HashMap
        Curtains curtains = new Curtains(mediator, "curtains");
		//创建 TV , 并  且加入到  ConcreteMediator 对象的HashMap
        TV tV = new TV(mediator, "TV");


        //让闹钟发出消息，状态为0，通知电视开机，窗帘关上
		alarm.sendAlarm(0);
		coffeeMachine.filishCoffee();
    }
}
