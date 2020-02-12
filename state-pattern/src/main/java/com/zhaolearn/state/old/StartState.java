package com.zhaolearn.state.old;

/**
 * Hello world!
 *
 */
public class StartState implements State {
    public String toString(){
        return "Start State";
    }
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }
}
