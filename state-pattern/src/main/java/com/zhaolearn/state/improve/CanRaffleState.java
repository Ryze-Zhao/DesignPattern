package com.zhaolearn.state.improve;

import java.util.Random;

/**
 * 可以抽奖的状态
 * @author Administrator
 *
 */
public class CanRaffleState extends AbstractState {
    // 当前状态不能扣除积分\不能发奖品；因此不重写deductMoney\dispensePrize。
    @Override
    public boolean raffle(RaffleActivity activity) {
        System.out.println("正在抽奖，请稍等！");
        Random r = new Random();
        //10%中奖几率
        int num = r.nextInt(10);
        if(num == 0){
            // 改变活动状态为发放奖品 context
            activity.setState(new DispenseState());
            return true;
        }else{
            System.out.println("很遗憾没有抽中奖品！");
            // 改变状态为不能抽奖
            activity.setState(new NoRaffleState());
            return false;
        }
    }

    @Override
    public String getCurrentState() {
        return StateEnum.CANRAFFLE.getValue();
    }
}
