package com.zhaolearn.state.improve;

import lombok.Getter;
import lombok.Setter;

/**
 * 抽奖活动 //
 * 
 * @author Administrator
 *
 */
@Getter
@Setter
public class RaffleActivity{
	// state 表示活动当前的状态，是变化
    private State state;
    // 奖品数量
    private int count;
    //构造器
    //1. 初始化当前的状态为 noRafflleState（即不能抽奖的状态）
    //2. 初始化奖品的数量 
    public RaffleActivity(int count) {
        this.state = new NoRaffleState();
        this.count = count;
    }

    //扣分, 调用当前状态的 deductMoney
    public void deductMoney() {
        if(this.count==0){
            //没奖品就不扣分，并且设置活动的状态为奖品领完
            state=new DispenseOutState();
        }else {
            state.deductMoney(this);
        }
        getCurrentState();
    }

    //抽奖
    public void raffle() {
        // 如果当前的状态是抽奖成功
        if(state.raffle(this)){
            //领取奖品
            state.dispensePrize(this);
        }
        getCurrentState();
    }

    public String getCurrentState() {
        System.out.println("当前状态 : " + state.getCurrentState());
        return state.getCurrentState();
    }
}
