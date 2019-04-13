package oop;

public class CDAccount extends BankAccount implements IRate {

	String interestRate;
	
	void comppound() {
		System.out.println("Compounding interest");
	}
}
