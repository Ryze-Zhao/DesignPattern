package com.zhaolearn.prox;

public class ProxFile implements File {
    private String fileName;
    private RealFile realFile;
    public ProxFile(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void loadFile() {
        if(realFile == null){
            realFile = new RealFile(fileName);
        }
        realFile.loadFile();
    }
}
