package com.zhaolearn.businessdelegate;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTestBusinessDelegate{
    @Test
    public void appTestBusinessDelegate() {
        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");
        Client client = new Client(businessDelegate);
        client.doTask();
        businessDelegate.setServiceType("JMS");
        client.doTask();
    }
}
