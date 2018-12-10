package com.zhaolearn.mediator;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Communication {
    public static void communication(User user, String content) {
        System.out.println(user.getName() + "：" + content);
    }
}
