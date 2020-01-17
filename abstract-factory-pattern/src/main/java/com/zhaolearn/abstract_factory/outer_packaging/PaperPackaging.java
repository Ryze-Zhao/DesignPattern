package com.zhaolearn.abstract_factory.outer_packaging;

public class PaperPackaging implements Packaging {
    @Override
    public void tellMePackagingName() {
        System.out.println("My Name is PaperPackaging");
    }
}
