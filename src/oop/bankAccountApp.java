package oop;

public class bankAccountApp {

	public static void main(String[] args) {
		// Creating a new bank account >> think instantiate an object
		
		BankAccount acc1 = new BankAccount();
		
		//acc1.name = "Roger Hue";
		// WIth encapsulation
		
		acc1.setName("Roger Hue");
		System.out.println(acc1.getName());
		
		acc1.setSsn("45454498");
		System.out.println("SSN: " + acc1.getSsn());
		
		acc1.accountNumber = "02115151";
		acc1.balance = 10000;
		acc1.setRate();
		acc1.increaseRate();
		
		acc1.deposit(1500);
		
		
		//Polymorphism through overriding
		System.out.println(acc1.toString());
		
	
		//Polymorphism through overloading
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "02115151";
		
		
		BankAccount acc3 = new BankAccount("Savings Account", 5000);
		acc3.accountNumber = "02115151";
		
		
		
		
		/*
		acc3.checkBalance();
		
		
		// Demo for inheritance
		cdaccount cd1 = new cdaccount();
		cd1.balance = 3000;
		cd1.name = "Juan";
		cd1.interestRate = "4.5";
		cd1.accountType = "CD account";
		cd1.accountNumber = "5645484";
		cd1.compound();
		System.out.println(cd1.toString());
		*/

	}

}
