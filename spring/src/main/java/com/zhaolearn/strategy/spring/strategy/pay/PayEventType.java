package com.zhaolearn.strategy.spring.strategy.pay;


public enum PayEventType {
    ABC(0, "中国农业银行"),
    BANKOFCHINA(1, "中国银行"),
    CCB(2, "中国建设银行"),
    ICBC(3, "中国工商银行");

    private final Integer key;
    private final String value;

    PayEventType(Integer key, String value) {
        this.key = key;
        this.value = value;
    }

    public Integer getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
