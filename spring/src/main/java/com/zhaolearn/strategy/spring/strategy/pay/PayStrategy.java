package com.zhaolearn.strategy.spring.strategy.pay;

import java.util.Set;


public interface PayStrategy {
    Set<Integer> getStrategyCode();
    void execute(String data);
}
