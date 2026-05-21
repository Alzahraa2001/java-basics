package com.training;

class Account {

    protected int accountNumber;
    protected String customerName;
    protected double balance;

    public Account(int accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // deposit
    public void deposit(double amount) {
        balance += amount; //balance = balance+amount
        System.out.println(amount+"got deposted successfully in your account");
    }

    
    //withdraw
    public void withdraw(double amount) {
    	if(amount < balance) {
    		balance -= amount;
    		System.out.println(amount+"got withdraw successfully in your account");
    	}
    	else {
    		System.out.println("Insufficient balance");
    	}
    }
    
    // display
    public void displayBalance() {
        System.out.println("Account Balance: " + balance);
    }
}

    




//Abstract method: No implement
//Correct method: Having implement
//interface:(100% abstract)
	