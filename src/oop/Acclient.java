/*In this class, I am to create an array for 2 clients. Add 2 accounts for the first and 3 for the second. Then print the information of each client
using toString() As you'll see the toString() method will give me each clients details and the information of all their accounts*/
package oop;

import java.util.Scanner;

public class Acclient {

	public static void main(String[] args) {
		Scanner reads = new Scanner(System.in);

		Client[] clients = new Client[2];

		// This loop instantiates the clients objects in the array by giving them values
		// from the user
		for (int i = 0; i < clients.length; i++) {
			System.out.println("Enter id, name, and phone number for client " + (i + 1) + " below");

			int id = reads.nextInt(); // Reads the integer for id
			reads.nextLine(); // Consume the leftover newline character. Ask chatGpt if you want to know what
								// that means

			String name = reads.nextLine(); // Reads the name
			String phoneNumber = reads.nextLine(); // Reads the phone number

			clients[i] = new Client(id, name, phoneNumber); // Create Client object

		}

		// Below I've created an Account array for the first client called acc1, who has
		// 2 accounts
		Account[] acc1 = new Account[2];

		// This loop instantiates the account objects in the array by giving them values
		// from the user
		for (int i = 0; i < acc1.length; i++) {
			System.out.println("For 1st client, enter details of their account number " + (i + 1)
					+ ". Account id, balance and annual interest rate");
			acc1[i] = new Account(reads.nextInt(), reads.nextDouble(), reads.nextDouble());
			clients[0].addAccount(acc1[i]); // This method adds all accounts created to the first client's array list
											// created in the class
		}

		// Below I've created an Account array for the first client called acc1, who has
		// 2 accounts
		Account[] acc2 = new Account[3];

		// This loop instantiates the account objects in the array by giving them values
		// from the user

		for (int i = 0; i < acc2.length; i++) {
			System.out.println("For 2nd client, enter details of their account number" + (i + 1)
					+ ". Account id, balance and annual interest rate");
			acc2[i] = new Account(reads.nextInt(), reads.nextDouble(), reads.nextDouble());
			clients[1].addAccount(acc2[i]); // This method adds all accounts created to the second client's array list
											// created in the class
		}

		System.out.println(clients[0].toString());
		System.out.println(clients[1].toString());
		
		reads.close();

	}

}
