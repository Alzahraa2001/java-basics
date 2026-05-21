package com.training;

public class SavingAccount extends Account {
	private float interestRate = 4.5f;
	
	public SavingAccount(int accountNumber, String customerName, double balance, 
			float interestRate) {
		super(accountNumber, customerName, balance);
		this.interestRate = interestRate;
	}
	
	public float getInteresRate() {
		return interestRate;
	}
	public void setInteresRate(float interestRate) {
		
	}

	public float getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
	
}

