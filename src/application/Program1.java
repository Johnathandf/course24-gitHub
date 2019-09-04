package application;

import entities.Account;
import entities.BussinessAccount;
import entities.SavingsAccount;

public class Program1 {

	public static void main(String[] args) {
		
		
		Account acc1 = new Account(1001, "Johnn", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new SavingsAccount(1002, "João", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BussinessAccount(1003, "Carlos", 1000.0, 500.00);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance() );

	}

}
