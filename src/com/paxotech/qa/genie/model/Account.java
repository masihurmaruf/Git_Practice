/**
 * 
 */
package com.paxotech.qa.genie.model;

/**
 * @author Masihur
 *
 */
public class Account {
	private double balance = 0;

	
	
	public void deposit(double amount) {
		if(amount>0){

			balance = balance + amount;
		}
		else{
			System.out.println("Enter the Valid Amount");
		}
	}

	public void withdraw(double amount) {
		if(amount>0){
			if(amount<balance){

				balance = balance - amount;
			}
			else{
				System.out.println("enter the amount less then balance");
			}
		}
		else{
			System.out.println("Please Enter Valid Amount");
		}
	}

	public double getBalance() {

		return balance;
	}
}
