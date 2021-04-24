package com.zhaolearn.strategy.spring.strategy;


import com.zhaolearn.strategy.spring.strategy.pay.PayEventType;
import com.zhaolearn.strategy.spring.strategy.pay.PayStrategy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


@Component
public class AllStrategy implements InitializingBean {
    private Map<Integer, PayStrategy> payStrategyMap = new ConcurrentHashMap<>(PayEventType.values().length);
    @Autowired
    private ApplicationContext applicationContext;

    @Override
    public void afterPropertiesSet() {
        Map<String, PayStrategy> matchBeans = applicationContext.getBeansOfType(PayStrategy.class);
        matchBeans.forEach((key, handler) -> handler.getStrategyCode().stream().forEach(e -> payStrategyMap.put(e, handler)));
    }

    public PayStrategy getPayStrategy(int strategyCode) {
        return payStrategyMap.get(strategyCode);
    }
}