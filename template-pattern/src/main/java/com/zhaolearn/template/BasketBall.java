package com.zhaolearn.template;

import java.lang.management.GarbageCollectorMXBean;

public class BasketBall extends Game {
    @Override
    void endPlay() { System.out.println("BasketBall Game Finished!"); }
    @Override
    void initialize() {
        System.out.println("BasketBall Game Initialized! Start playing.");
    }
    @Override
    void startPlay() {
        System.out.println("BasketBall Game Started. Enjoy the game!");
    }
}
