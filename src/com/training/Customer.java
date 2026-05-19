package com.training;
import java.util.Scanner;
public class Customer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter customer name:");
		String customerName = sc.nextLine();
		System.out.println("Enter customer last name:");
		String lastName = sc.nextLine();
		System.out.println("Enter your Age:");
		int customerAge = sc.nextInt();

		
		//next() -> will take single string without space
		//nextInt() -> to input integer values
		//String firstName = "Ali";
		//String lastName = "Ahmed";
		//int customerAge = 25;
		byte b = 112;
		short s = 115;
		//s = b;
		b=(byte)s;
		System.out.println("Customer class");
		System.out.println("Customer Details: "+customerName +" "+ lastName + " " + "Age:"+customerAge);
		
	
		if (customerAge > 18) {
			System.out.println("Eligible to open an account");
		} else {
			System.out.println("Not yet eligible to open an account");
		}

		sc.close();
	}

}

// import shortcut: ctrl+shift+o
//Java is a strongly typed language 
// variable is placeholder pointing to a memory location
//create variables that will store customer first name , 
//customer last name, customer age.
// and display all the customer details in a single line

// check if the customer is more than 18 then display
// Eligible to open an account
// else display: Not yet eligible to open an account