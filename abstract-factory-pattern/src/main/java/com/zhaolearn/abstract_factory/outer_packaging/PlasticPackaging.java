package com.zhaolearn.abstract_factory.outer_packaging;

public class PlasticPackaging implements Packaging {
    @Override
    public void tellMePackagingName() {
        System.out.println("My Name is PlasticPackaging");
    }
}
