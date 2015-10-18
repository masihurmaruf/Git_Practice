/**
 * 
 */
package com.paxotech.qa.genie;

import com.paxotech.qa.genie.model.Account;

/**
 * @author Masihur
 *
 */
public class MyApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Account acc = new Account();
		
		acc.deposit(-1000);
		acc.deposit(1000);
		acc.withdraw(-100);
		acc.withdraw(1100);
		
		System.out.println(acc.getBalance());
		

	}

}
