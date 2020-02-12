package com.zhaolearn.state.improve;

import com.sun.org.apache.bcel.internal.generic.RETURN;

/**
 * 奖品发放完毕状态
 * 说明，当我们activity 改变成 DispenseOutState， 抽奖活动结束
 *
 * @author Administrator
 */
public class DispenseOutState extends AbstractState {
    @Override
    public void deductMoney(RaffleActivity activity) {
        System.out.println("奖品发送完了，请下次再参加");
    }

    // 是否抽中奖品
    @Override
    public boolean raffle(RaffleActivity activity) {
        System.out.println("奖品发送完了，请下次再参加");
        return false;
    }

    // 发放奖品
    @Override
    public void dispensePrize(RaffleActivity activity) {
        System.out.println("奖品发送完了，请下次再参加");
    }

    @Override
    public String getCurrentState() {
        return StateEnum.DISPENSEOUT.getValue();
    }
}
