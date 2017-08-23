package com.karnan.budgetapplication.business;

public class Compute {	
	
	public static double balance(int netPay, int totalPrice){
		double remainder = netPay - totalPrice;		
		return remainder;
	}
}