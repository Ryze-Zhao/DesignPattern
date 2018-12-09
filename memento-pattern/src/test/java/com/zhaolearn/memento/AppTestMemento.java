package com.zhaolearn.memento;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTestMemento {

    @Test
    public void appTestMemento() {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setStatus("状态1");
        originator.setStatus("状态2");
        careTaker.add(originator.saveStatusToMemento());
        originator.setStatus("状态3");
        careTaker.add(originator.saveStatusToMemento());
        originator.setStatus("状态4");
        System.out.println("当前状态: " + originator.getStatus());
        originator.getStatusFromMemento(careTaker.get(0));
        System.out.println("第一次保存状态: " + originator.getStatus());
        originator.getStatusFromMemento(careTaker.get(1));
        System.out.println("第二次保存状态: " + originator.getStatus());

    }
}
