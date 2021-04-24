package com.zhaolearn.strategy.spring.strategy;

import com.zhaolearn.strategy.spring.Application;
import com.zhaolearn.strategy.spring.strategy.pay.PayEventType;
import com.zhaolearn.strategy.spring.strategy.pay.PayStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class})
public class StrategyTest {

    @Autowired
    private AllStrategy allStrategy;

    @Test
    public void test() {
        PayStrategy strategy = allStrategy.getPayStrategy(PayEventType.ICBC.getKey());
        strategy.execute("执行策略Key为"+PayEventType.ICBC.getKey());
    }
}