//Here I'll be creating an ArrayList of Accounts and displaying the number of deposits and withdrawals of each account
package oop;

import java.util.ArrayList;

public class Accaction {
	public static void main(String[] args) {
		ArrayList<Account> accounts = new ArrayList<>();

		Account acc1 = new Account(232, 20000, 3.1, new Client(1, "Frank Daniel", "s133289"));
		accounts.add(acc1);
		
		Account acc2 = new Account(922, 129400, 2.7, new Client(2, "Sano Manjiro", "ae23393"));
		accounts.add(acc2);
		
		acc1.deposit(3213);
		acc2.withdraw(1000);
		
		
		System.out.println(acc1.countTransactions('W'));
		System.out.println(acc1.countTransactions('D'));
		System.out.println(acc2.countTransactions('W'));
		System.out.println(acc2.countTransactions('D'));
	}
}
