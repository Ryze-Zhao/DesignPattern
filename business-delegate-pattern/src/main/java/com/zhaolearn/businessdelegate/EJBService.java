package com.zhaolearn.businessdelegate;

public class EJBService implements BusinessService {
    @Override
    public void doProcessing() { System.out.println("调用EJBService的方法！！！"); }
}
