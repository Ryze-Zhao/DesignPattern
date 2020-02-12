package com.zhaolearn.state.improve;

/**
 * 不能抽奖状态
 * @author Administrator
 *
 */
public class NoRaffleState extends AbstractState {
    // 当前状态不能抽奖\不能发奖品；因此不重写raffle\dispensePrize。

    @Override
    public void deductMoney(RaffleActivity activity) {
        System.out.println("扣除50积分成功，您可以抽奖了");
        activity.setState(new CanRaffleState());
    }

    @Override
    public String getCurrentState() {
        return StateEnum.NORAFFLE.getValue();
    }
}
