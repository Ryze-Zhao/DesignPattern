package com.zhaolearn.servicelocator;

/**
 * Hello world!
 *
 */
public class Service2 implements Service {
    @Override
    public String getName() {
        return "Service2";
    }
    @Override
    public void execute() {
        System.out.println("执行了Service2");
    }
}
