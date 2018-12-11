package com.zhaolearn.businessdelegate;

public class JMSService implements BusinessService {
    @Override
    public void doProcessing() { System.out.println("调用JMSService的方法！！！"); }
}
