package oop;

import java.util.Date;

public class Transaction {
	private char type;
	private double amount;
	private double balance;
	private Date date;
	private String description;

	public Transaction(char type, double amount, double balance, String description) {
		this.type = type;  //W for withdrawing or D for depositing
		this.amount = amount;
		this.balance = balance;
		this.description = description;
		date = new Date(); // Will be instantiated to contain the current date and time
	}

	//Used to get the type of transaction that is W or D
	public char getType() {
		return type;
	}
	
	

}
