package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.BussinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account acc = new Account(1001, "Alex", 0.0);
		BussinessAccount bacc = new BussinessAccount(1002, "Maria", 0.0, 500.00);
		
		//UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BussinessAccount(1003, "Bob", 0.0, 200.00);
		Account acc3 = new SavingsAccount(1004,"Ana" , 0.0, 0.01);
		
		//DOWNCASTING
		
		BussinessAccount acc4 = (BussinessAccount)acc2;
		//BussinessAccount acc5 = (BussinessAccount)acc3;
		if(acc3 instanceof BussinessAccount) {
			BussinessAccount acc5 = (BussinessAccount)acc3;
			acc5.loan(200.00);
			System.out.println("Loan!");
		}
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.upDateBalance();
			System.out.println("UpDate!");
		}
		
		sc.close();
	}

}
