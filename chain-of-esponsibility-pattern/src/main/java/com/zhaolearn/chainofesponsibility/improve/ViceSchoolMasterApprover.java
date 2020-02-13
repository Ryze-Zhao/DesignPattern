package com.zhaolearn.chainofesponsibility.improve;

import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;

public class ViceSchoolMasterApprover extends Approver {
	public ViceSchoolMasterApprover(String name) {
		super(name);
	}
	@Override
	public void processRequest(PurchaseRequest purchaseRequest) {
		if(purchaseRequest.getPrice() < 10000 && purchaseRequest.getPrice() <= 30000) {
			System.out.println(" 请求编号 id= " + purchaseRequest.getId() + " 被 " + this.getName() + " 处理");
		}else {
			this.getApprover().processRequest(purchaseRequest);
		}
	}
}
