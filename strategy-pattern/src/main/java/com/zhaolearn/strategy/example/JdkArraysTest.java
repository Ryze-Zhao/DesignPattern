package com.zhaolearn.strategy.example;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 策略模式在JDK的Arrays的Comparator中使用
 *
 *
 * 代码介绍：
 * 1、Comparator接口相当于我们的策略接口
 * 2、我们的实现，其实就是一种具体的策略
 * 3、Arrays.sort(data, comparator);时，我们等于传入了指定的策略，这个方法就根据具体的策略进行排序
 *
 *
 * @author: HeHaoZhao
 * @date: 2020/2/11 21:55
 */
public class JdkArraysTest {
    public static void main(String[] args) {
        Integer[] data = {9, 1, 2, 8, 4, 3};
        //实现升序排序,返回-1放左边,1放右边,0保持不变
        //说明
        //1.实现了Comparator接口(策略接口),匿名类对象 new Comparator<Integer>(){.....｝
        //2.对象new Comparator<Integer>(){..}就是实现了策略接口的对象
        //3.public int compare(Integer o1,Integer o2){}指定具体的处理方式
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };
        /**
         public static <T> void sort(T[] a, Comparator<? super T> c) {
         if (c == null) {
         //默认方法
         sort(a);
         } else {
         if (LegacyMergeSort.userRequested)
         //使用给入的策略
         legacyMergeSort(a, c);
         else
         //也是使用给入策略
         TimSort.sort(a, 0, a.length, c, null, 0, 0);
         }
         }
         */
        Arrays.sort(data, comparator);
        //升序,调转上面的返回1或者-1可以改为降序
        System.out.println(Arrays.toString(data));

        //方式2-同时lambda表达式实现，使用策略模式
        Integer[] data2 = {19, 11, 12, 18, 14, 13};
        Arrays.sort(data2, (var1, var2) -> {
            if (var1.compareTo(var2) > 0) {
                return 1;
            } else {
                return -1;
            }
        });
        //升序,调转上面的返回1或者-1可以改为降序
        System.out.println(Arrays.toString(data2));
    }
}