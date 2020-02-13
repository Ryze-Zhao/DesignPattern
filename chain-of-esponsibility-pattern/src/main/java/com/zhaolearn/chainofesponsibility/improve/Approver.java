package com.zhaolearn.chainofesponsibility.improve;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public abstract class Approver {
	private Approver approver;  //下一个处理者
	private String name; // 名字
	public Approver(String name) {
		this.name = name;
	}
	//处理审批请求的方法，得到一个请求, 处理是子类完成，因此该方法做成抽象
	public abstract void processRequest(PurchaseRequest purchaseRequest);
}
