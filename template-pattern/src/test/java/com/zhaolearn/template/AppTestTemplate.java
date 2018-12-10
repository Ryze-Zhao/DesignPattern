package com.zhaolearn.template;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class AppTestTemplate {

    @Test
    public void appTestTemplate() {
        Game game = new BasketBall();
        game.play();
        game = new FootBall();
        game.play();
    }
}
