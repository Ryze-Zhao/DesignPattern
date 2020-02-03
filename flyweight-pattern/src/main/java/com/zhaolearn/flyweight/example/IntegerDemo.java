package com.zhaolearn.flyweight.example;

public class IntegerDemo {
    public static void main(String[] args) {
        //如果Integer.valueOf(x)x在-128---127直接，就是使用享元模式返回，如果不在范围内，则仍然new
        //小结：
        //1.在valueof方法中，先判断值是否在Integer
        //2.value0f 方法，就使用到享元模式
        //3.如果使用valueOf 方法得到一个Integer实例，范围在-128-127，执行速度比new快


            //得到×实例，类型Integer
        Integer x = Integer.valueOf(127);
        //得到y实例，类型Integer
        Integer y = new Integer(127);
        Integer z = Integer.valueOf(127);
        Integer w = new Integer(127);


        System.out.println(x.equals(y));//大小，true
        System.out.println(x == y);//false
        System.out.println(x == z);//true
        System.out.println(w == x);//false
        System.out.println(w == y);//false

        Integer x1 = Integer.valueOf(200);
        Integer x2 = Integer.valueOf(200);
        //超出了IntegerCache.cache的范围（-128~127），因此为false
        System.out.println("x1==x2:" + (x1 == x2));//false

    }
}

