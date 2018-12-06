package com.zhaolearn.prox;

public class RealFile implements File {
    private String fileName;

    public RealFile(String fileName) {
        this.fileName = fileName;
        System.out.println("正在从磁盘加载文件： " + fileName);
    }
    @Override
    public void loadFile() {
        System.out.println("加载的文件名字为：" + fileName);
    }
    public RealFile() {
    }
}
