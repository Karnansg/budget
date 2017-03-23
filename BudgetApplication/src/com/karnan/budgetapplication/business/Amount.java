package com.karnan.budgetapplication.business;

public class Amount {
	
	private int usedAmount;
	
	public Amount(int usedAmount){
		this.usedAmount = usedAmount;		
	}	
	public int getUsedAmount() {
		return usedAmount;
	}
	public void setUsedAmount(int usedAmount) {
		this.usedAmount = usedAmount;
	}		
}