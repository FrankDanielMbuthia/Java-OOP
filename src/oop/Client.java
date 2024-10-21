//This class will give a client ability to own various accounts. The Account class is also created to show what each account's blueprint is.

package oop;

import java.util.ArrayList;

public class Client {
	private int id;
	private String name;
	private String phone;
	private ArrayList<Account> accounts; // Think of it as saying an array list of type String

	public Client(int id, String name, String phone) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		accounts = new ArrayList<>(); // We are instantiating the Array list every time we create a Client object.

	}

	public void addAccount(Account acc) {
		accounts.add(acc);

	}

	public boolean removeAccount(int accountId) {
		for (Account acc : accounts) { // Meaning for each Account acc inside the accounts array list
			if (acc.getId() == accountId) {
				accounts.remove(accountId);
				return true;
			}
		}
		return false; // Meaning we didn't find account

	}

	public String toString() {
		String s = this.id + " " + this.name + " " + this.phone + "\n";
		/*
		 * This for loops iterates over all the accounts and concatenates a string
		 * representation of each account to the variables. The \n above creates a new
		 * line after every client and their info. The one below, creates a new line
		 * after every account of a single client.
		 */
		for (Account acc : accounts) {
			s += acc.toString() + "\n";
		}
		return s;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
