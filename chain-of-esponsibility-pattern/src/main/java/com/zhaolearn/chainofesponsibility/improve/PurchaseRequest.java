package com.zhaolearn.chainofesponsibility.improve;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

//请求类
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseRequest {
	private int type = 0; //请求类型
	private float price = 0.0f; //请求金额
	private int id = 0;
}
