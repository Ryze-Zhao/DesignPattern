package com.zhaolearn.state.improve;

import lombok.AllArgsConstructor;

/**
 * 状态抽象类
 * @author Administrator
 *
 */
public abstract class AbstractState implements State{
    protected static final RuntimeException EXCEPTION = new RuntimeException("操作流程不允许");
    //抽象类，默认实现了 State 接口的所有方法
    //该类的所有方法，其子类(具体的状态类)，可以有选择的进行重写

    // 扣除积分 - 50
    @Override
    public void deductMoney(RaffleActivity activity) {
        throw EXCEPTION;
    }
    // 是否抽中奖品
    @Override
    public boolean raffle(RaffleActivity activity) {
        throw EXCEPTION;
    }
    // 发放奖品
    @Override
    public void dispensePrize(RaffleActivity activity) {
        throw EXCEPTION;
    }
}
