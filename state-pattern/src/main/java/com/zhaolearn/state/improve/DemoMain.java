package com.zhaolearn.state.improve;

/**
 *
 * 业务场景：
 * 	​抽奖活动
 *
 * 代码说明：
 * 1、State接口：定义状态切换的方法；
 * 2、AbstractState抽象类：对所有接口的方法默认实现，丢出RuntimeException；
 * 3、NoRaffleState具体状态：不能抽奖状态，实现相应的方法；
 * 4、CanRaffleState具体状态：可以抽奖状态，实现相应的方法；
 * 5、DispenseState具体状态：中奖状态，实现相应的方法；
 * 6、DispenseOutState具体状态：奖品已发放完毕状态，实现相应的方法；
 * 7、StateEnum枚举类（非必要）：定义各种状态，用于返回；
 * 8、RaffleActivity活动类：存有State，与奖品数量；用于调用各状态动作；
 * 9、测试类：测试用
 * @author: HeHaoZhao
 * @date: 2020/2/12 14:36
 */
public class DemoMain {
	public static void main(String[] args) {
		// 创建活动对象，奖品有1个奖品
        RaffleActivity activity = new RaffleActivity(1);

        // 我们连续抽300次奖
        for (int i = 0; i < 3; i++) {
            System.out.println("--------第" + (i + 1) + "次抽奖----------");
            // 参加抽奖，第一步点击扣除积分
            activity.deductMoney();

            // 第二步抽奖
            activity.raffle();
        }
	}
}
