//I would advice that you watch with Neso to see the steps we took. In order to finish this class completely
package oop;

import java.util.ArrayList;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Client client;
	private ArrayList<Transaction> transactions;

	public Account(int id, double balance, double annualInterestRate, Client client) {
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		this.client = client;

		this.transactions = new ArrayList<>();
	}
	

	public boolean withdraw(double ammount) {
		if (ammount <= this.balance) {
			this.balance -= ammount;
			// This line adds a new element in the array list of type Transaction above and
			// instantiates the object at the same time
			this.transactions.add(new Transaction('W', ammount, this.balance, "Withdrawn " + ammount));
			return true;
		} else
			return false;

	}

	public void deposit(double ammount) {
		this.balance += ammount;
		// This line adds a new element in the array list of type Transaction above and
		// instantiates the object at the same time
		this.transactions.add(new Transaction('D', ammount, this.balance, "Deposited "+ammount));
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	//The below are getters and setters for the client
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	//This small code below is used in the last quiz. It is to get the number of transactions
	int count=0;
	public int countTransactions(char type) {
		for(Transaction trans : transactions)
			if(trans.getType() ==type)
				count++;
		return count;
		
	}
	

	// This method returns a string representation of the Account class
	public String toString() {
		return this.id + " " + this.balance + " " + this.annualInterestRate +"\n";
				
	}

}
