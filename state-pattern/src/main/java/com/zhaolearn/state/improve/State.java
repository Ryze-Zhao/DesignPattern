package com.zhaolearn.state.improve;

public interface State {
    // 扣除积分 - 50
   void deductMoney(RaffleActivity activity);
    // 是否抽中奖品
    boolean raffle(RaffleActivity activity);
    // 发放奖品
    void dispensePrize(RaffleActivity activity);
    //返回或输出当前状态
    String getCurrentState();
}
