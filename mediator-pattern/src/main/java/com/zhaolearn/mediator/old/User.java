package com.zhaolearn.mediator.old;

public class User {
    private String name;

    public void communication(String content) {
        Communication.communication(this, content);
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
