package com.zhaolearn.interceptingfilter;

/**
 * Hello world!
 *
 */
public class AuthenticationFilter implements Filter {
    public void execute(String request){
        System.out.println("AuthenticationFilter请求: " + request);
    }
}
