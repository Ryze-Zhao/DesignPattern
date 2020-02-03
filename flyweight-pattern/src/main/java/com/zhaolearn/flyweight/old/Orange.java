package com.zhaolearn.flyweight.old;

public class Orange implements Fruit {
    private String name;
    private String color;

    @Override
    public void tellMeNameAndColor() {
        System.out.println("My Name is "+name+" My Color is "+color);
    }

    public Orange() {
    }


    public Orange(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
