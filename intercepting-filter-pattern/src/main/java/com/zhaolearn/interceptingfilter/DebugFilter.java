package com.zhaolearn.interceptingfilter;

/**
 * Hello world!
 *
 */
public class DebugFilter implements Filter {
    public void execute(String request){
        System.out.println("DebugFilter请求: " + request);
    }
}
