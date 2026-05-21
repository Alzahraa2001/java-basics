package com.training;

public class BankClient {
	public static void main(String[] args) {
		
	SavingAccount savingAccount = new SavingAccount(1234,"Ali",500,4);
		
	savingAccount.displayBalance();
	    savingAccount.deposit(300);
		
		savingAccount.displayBalance(); 
		savingAccount.withdraw(200);
		savingAccount.displayBalance();
	}

}
