package com.zhaolearn.prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Sheep implements Cloneable {
    private String name;
    public Sheep(String name) {
        this.name = name;
    }
    //��¡��ʵ����ʹ��Ĭ�ϵ�clone���������
    @Override
    protected Object clone() {
        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sheep;
    }
}
