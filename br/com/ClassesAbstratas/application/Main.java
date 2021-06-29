package br.com.ClassesAbstratas.application;

import br.com.ClassesAbstratas.entities.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Account> list = new ArrayList<>();

        Account acc2 = new SavingsAccount(1002, "Maria", 2355.22, 0.01);
        Account acc3 = new BusinessAccount(1003, "Bob", 100.0, 1500.0);

        // UPCASTING
        list.add(acc2);
        list.add(acc3);

        double sum = 0;

        for(Account acc : list) sum += acc.getBalance();

        System.out.println(sum);

        for(Account acc : list) acc.deposit(10.0);

        for(Account acc : list) System.out.printf("Updated balance for account: %d: %.2f%n", acc.getNumber(), acc.getBalance());
    }
}
