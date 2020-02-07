package com.zhaolearn.mediator.old;

public class Communication {
    public static void communication(User user, String content) {
        System.out.println(user.getName() + "：" + content);
    }
}
