package com.zhaolearn.chainofesponsibility.old;

public class DebugLogger extends AbstractLogger {
    public DebugLogger(int level){
        this.level = level;
    }
    @Override
    protected void write(String message) {
        System.out.println("DeBug:" + message);
    }
}
