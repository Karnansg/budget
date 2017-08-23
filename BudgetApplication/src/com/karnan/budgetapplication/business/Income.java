package com.karnan.budgetapplication.business;

public class Income {
	private int paySlipId;
	private int userId;
	private int netPay;
	
	public int getPaySlipId() {
		return paySlipId;
	}
	public void setPaySlipId(int paySlipId) {
		this.paySlipId = paySlipId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getNetPay() {
		return netPay;
	}
	public void setNetPay(int netPay) {
		this.netPay = netPay;
	}
}
