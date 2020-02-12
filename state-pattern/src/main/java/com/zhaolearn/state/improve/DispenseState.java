package com.zhaolearn.state.improve;

/**
 * 发放奖品的状态
 *
 * @author Administrator
 */
public class DispenseState extends AbstractState {
    // 发放奖品
    @Override
    public void dispensePrize(RaffleActivity activity) {
        int count = activity.getCount();
        if (count > 0) {
            System.out.println("恭喜中奖了");
            // 改变状态为不能抽奖
            activity.setCount(--count);
            activity.setState(new NoRaffleState());
        } else {
            System.out.println("很遗憾，奖品发送完了");
            // 改变状态为奖品发送完毕, 后面我们就不可以抽奖
            activity.setState(new DispenseOutState());
        }
    }

    @Override
    public String getCurrentState() {
        return StateEnum.DISPENSE.getValue();
    }
}
