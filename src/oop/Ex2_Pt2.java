package oop;

public class Ex2_Pt2 {

	public static void main(String[] args) {
		Account testAccount = new Account(1122,20000,4.5);
		
		System.out.println(testAccount.getBalance());
		
		//Condition that checks if amount is withdrawable
		if(testAccount.withdraw(2500))
			System.out.println("Withdrawal successful");
		else
			System.out.println("Withdrawal unsuccessful");
		
		System.out.println(testAccount.getBalance());
		testAccount.deposit(3000);
		System.out.println(testAccount.getBalance());
		
	}

}
