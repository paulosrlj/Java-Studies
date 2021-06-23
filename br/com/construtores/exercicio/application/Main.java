package br.com.construtores.exercicio.application;

import java.util.Scanner;
import java.util.Locale;
import br.com.construtores.exercicio.entities.BankAccount;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		BankAccount bc;
			
		System.out.println("Type the account number: ");
		String accountNumber = sc.nextLine();
		
		System.out.println("Type the account name: ");
		String accountName = sc.nextLine();
		
		System.out.println("Is there a initial deposit (y/n)?");
		String choise = sc.nextLine();
		
		if(choise.equals("y")) {
			System.out.println("Type the inital deposit: ");
			float initialDeposit = sc.nextFloat();
			sc.nextLine();
			
			bc = new BankAccount(accountNumber, accountName, initialDeposit);
		} else
			bc = new BankAccount(accountNumber, accountName);
		
		bc.printAccountData();
		
		System.out.println("Enter a deposit value: ");
		float depositValue = sc.nextFloat();
		sc.nextLine();
		bc.deposit(depositValue);
		System.out.println("Updated account data!");
		bc.printAccountData();
		
		System.out.println("Enter a withdraw value: ");
		float withdrawValue = sc.nextFloat();
		sc.nextLine();
		bc.withdraw(withdrawValue);
		bc.printAccountData();
		
		sc.close();
	}

}
