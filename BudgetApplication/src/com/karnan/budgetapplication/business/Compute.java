package com.karnan.budgetapplication.business;

public class Compute {	
	public double balance(int retrievedAmount, int usedAmount){
		double remainder = retrievedAmount - usedAmount;		
		return remainder;
	}
}