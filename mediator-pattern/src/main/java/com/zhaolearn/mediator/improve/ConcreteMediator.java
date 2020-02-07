package com.zhaolearn.mediator.improve;

import java.util.HashMap;

//具体的中介者类
public class ConcreteMediator implements Mediator {
    //集合，放入所有的同事对象
    private HashMap<String, Colleague> colleagueMap;

    public ConcreteMediator() {
        colleagueMap = new HashMap<String, Colleague>();
    }

    @Override
    public void register(String colleagueName, Colleague colleague) {
        colleagueMap.put(colleagueName, colleague);
    }

    //具体中介者的核心方法
    //1. 根据得到消息，完成对应任务
    //2. 中介者在这个方法，协调各个具体的同事对象，完成任务
    @Override
    public void getMessage(int stateChange, String colleagueName) {

        if (colleagueMap.containsKey(colleagueName)) {
            if (colleagueMap.get(colleagueName) instanceof Alarm) {
                //处理闹钟发出的消息
                if (stateChange == 0) {
                    //闹钟响起来，通知电视开机，窗帘关上；
                    ((TV) (colleagueMap.get("TV"))).startTv();
                    ((Curtains) (colleagueMap.get("curtains"))).coloseCurtains();
                }
            } else if (colleagueMap.get(colleagueName) instanceof CoffeeMachine) {
                if (stateChange == 0) {
                    ((Alarm) (colleagueMap.get("alarm"))).closeAlarm();
                }
            } else if (colleagueMap.get(colleagueName) instanceof TV) {
                //如果TV发现消息

            } else if (colleagueMap.get(colleagueName) instanceof Curtains) {
                //窗帘发出的消息
                if (stateChange == 0) {
                    ((CoffeeMachine) (colleagueMap.get("coffeeMachine"))).startCoffee();
                    ((TV) (colleagueMap.get("TV"))).motionPictures();
                }
            }
        }
    }

    @Override
    public void sendMessage() {
    }
}
