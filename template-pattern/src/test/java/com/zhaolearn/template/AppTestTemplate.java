package com.zhaolearn.template;

import static org.junit.Assert.assertTrue;

import com.zhaolearn.template.old.BasketBall;
import com.zhaolearn.template.old.FootBall;
import com.zhaolearn.template.old.Game;
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
