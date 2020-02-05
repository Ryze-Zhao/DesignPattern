package com.zhaolearn.command;

import static org.junit.Assert.assertTrue;

import com.zhaolearn.command.old.Broker;
import com.zhaolearn.command.old.BuyClass;
import com.zhaolearn.command.old.RequestClass;
import com.zhaolearn.command.old.SellClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTestCommand {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void apTestCommand(){
        RequestClass requestClass = new RequestClass();
        BuyClass buyClass = new BuyClass(requestClass);
        SellClass sellClass = new SellClass(requestClass);
        Broker broker = new Broker();
        broker.takeCommand(buyClass);
        broker.takeCommand(sellClass);
        broker.placeCommands();
    }
}
