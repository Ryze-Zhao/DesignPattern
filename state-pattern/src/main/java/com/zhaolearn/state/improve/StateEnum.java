package com.zhaolearn.state.improve;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 状态枚举类
 *
 * @author Administrator
 */
@Getter
@AllArgsConstructor
public enum StateEnum {
    //不能抽奖
    NORAFFLE(1, "不能抽奖"),
    //可以抽奖
    CANRAFFLE(2, "可以抽奖"),
    //发放奖品
    DISPENSE(3, "发放奖品"),
    //奖品领完
    DISPENSEOUT(4, "奖品领完");

    private int key;
    private String value;
}
