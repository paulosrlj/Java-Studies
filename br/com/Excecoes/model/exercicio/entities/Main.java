package br.com.Excecoes.model.exercicio.entities;

import br.com.Excecoes.model.exercicio.exceptions.AccountExpections;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Holder: ");
        String holder = sc.nextLine();
        System.out.print("Initial balance: ");
        float initialBalance = sc.nextFloat();
        System.out.print("Withdraw limit: ");
        float withdrawLimit = sc.nextFloat();

        Account acc = new Account(number, holder, initialBalance, withdrawLimit);

        System.out.println();
        System.out.print("Enter amount for withdraw: ");
        float amount = sc.nextFloat();

        try {
            acc.withdraw(amount);

            System.out.println("New balance: " + acc.getBalance());
        } catch (AccountExpections e) {
            System.out.println("Withdraw error: " + e.getMessage());
        } catch (RuntimeException e) {
            // Exceção genérica
            System.out.println("Unexpected error");
        }
    }
}
