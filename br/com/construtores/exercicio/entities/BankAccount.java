package br.com.construtores.exercicio.entities;

public class BankAccount {
	private String accountNumber;
	private String name;
	private float balance = 0;

	public BankAccount(String accountNumber, String name, float deposit) {
		this.accountNumber = accountNumber;
		this.name = name;
		deposit(deposit);
	}

	public BankAccount(String accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBalance() {
		return balance;
	}

	public void withdraw(float amount) {
		this.balance -= amount;
		this.balance -= 5.0f;
	}

	public void deposit(float amount) {
		this.balance += amount;
	}

	public void printAccountData() {
		System.out.println("Account data:");
		System.out.printf("Account: %s, Holder: %s, " + "Balance: $ %.2f%n", accountNumber, name, balance);
	}
}
