package com.zhaolearn.chainofesponsibility.old;

public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level){ this.level = level; }
    @Override
    protected void write(String message) {
        System.out.println("INFO:" + message);
    }
}
