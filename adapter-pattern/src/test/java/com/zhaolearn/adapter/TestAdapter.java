package com.zhaolearn.adapter;

import static org.junit.Assert.assertTrue;

import com.zhaolearn.adapter.old.ComputerUsb;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class TestAdapter
{
    @Test
    public void testAdapterPattern() {
        ComputerUsb computerUsb = new ComputerUsb();
        computerUsb.connect("USB","插入USB");
        computerUsb.connect("SD","插入SD");
        computerUsb.connect("MMC","插入MMC");
        computerUsb.connect("USB10","插入USB10");
    }
}
