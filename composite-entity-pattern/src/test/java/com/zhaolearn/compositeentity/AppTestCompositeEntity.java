package com.zhaolearn.compositeentity;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTestCompositeEntity {
    @Test
    public void appTestCompositeEntity(){
        Client client = new Client();
        client.setData("Test1", "Test2");
        client.printData();
        System.out.println("---------");
        client.setData("Demo1", "Demo2");
        client.printData();
    }
}
