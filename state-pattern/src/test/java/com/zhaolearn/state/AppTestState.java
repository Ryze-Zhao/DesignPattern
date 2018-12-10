package com.zhaolearn.state;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTestState {
    @Test
    public void appTestState() {
        Context context = new Context();
        State state1 = new StartState();
        state1.doAction(context);
        System.out.println(context.getState().toString());
        State state2 = new StopState();
        state2.doAction(context);
        System.out.println(context.getState().toString());
    }
}
