package com.zhaolearn.command;

import static org.junit.Assert.assertTrue;

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
