package oop;

public class cdaccount extends BankAccount implements IRate {
	
	String interestRate;
	
	void compound() {
		System.out.println("Compounding Interest");
				
	}
	
}
