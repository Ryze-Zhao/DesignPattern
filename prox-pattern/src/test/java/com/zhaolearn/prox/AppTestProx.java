package com.zhaolearn.prox;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTestProx
{
    @Test
    public void appTestProx() {
        File image = new ProxFile("test_filename");
        //第一次加载会显示正在从磁盘加载文件：
        image.loadFile();
        //第二次加载不会显示，因为第二次ProxFile已经存储下来RealFile了
        image.loadFile();
    }
}
