package com.zhaolearn.chainofesponsibility.improve;

/**
 *
 * PurchaseRequest：请求类
 * Approver：审批人抽象类
 * DepartmentApprover：教学主任
 * CollegeApprover：院长
 * ViceSchoolMasterApprover：副校长
 * SchoolMasterApprover：校长
 *
 * @author: HeHaoZhao
 * @date: 2020/2/13 12:13
 */
public class DemoMian {
	public static void main(String[] args) {
		//创建一个请求
		PurchaseRequest purchaseRequest = new PurchaseRequest(1, 31000, 1);
		
		//创建相关的审批人
		DepartmentApprover departmentApprover = new DepartmentApprover("张主任");
		CollegeApprover collegeApprover = new CollegeApprover("李院长");
		ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("王副校");
		SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("佟校长");

		//需要将各个审批级别的下一个设置好 (处理人构成环形: 否则，如果他使用更高级别的调用会导致报错)
		//如，经费1000，但是我们用SchoolMasterApprover调用，就会出现问题
		departmentApprover.setApprover(collegeApprover);
		collegeApprover.setApprover(viceSchoolMasterApprover);
		viceSchoolMasterApprover.setApprover(schoolMasterApprover);
		schoolMasterApprover.setApprover(departmentApprover);
		

		departmentApprover.processRequest(purchaseRequest);
		viceSchoolMasterApprover.processRequest(purchaseRequest);
	}
}
