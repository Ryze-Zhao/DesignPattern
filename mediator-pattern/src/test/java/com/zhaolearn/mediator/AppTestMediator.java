package com.zhaolearn.mediator;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTestMediator {
    @Test
    public void appTestMediator(){
        User ryze=new User("Ryze");
        User ziggs=new User("Ziggs");
        ryze.communication("How are you,Ziggs");
        ziggs.communication("He,Ryze");
    }
}
