package com.zhaolearn.strategy.spring.strategy.pay;

import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@Component
public class CcbPayStrategy implements PayStrategy {
    @Override
    public Set<Integer> getStrategyCode() {
        return Stream.of(PayEventType.CCB.getKey()).collect(Collectors.toSet());
    }

    @Override
    public void execute(String data) {
        System.out.println(data+" 支付方式："+PayEventType.CCB.getValue());
    }
}
