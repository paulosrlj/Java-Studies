package br.com.Heranca.application;
import br.com.Heranca.classes.*;

public class Main {
    public static void main(String[] args) {
        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        // UPCASTING -> Converter da subclsse para superclasse
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 200.0);

        // DOWNCASTING -> converter objeto da superclasse para subclasse

        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(100.0);

        // BusinessAccount acc5 = (BusinessAccount) acc3;
        BusinessAccount acc5;
        if(acc3 instanceof BusinessAccount) {
            acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        SavingsAccount acc6;
        if(acc3 instanceof SavingsAccount) {
            acc6 = (SavingsAccount) acc3;
            acc6.updateBalance();
            System.out.println("Update");
        }

        // Sobrescrita
        Account acc7 = new Account (1001, "Alex", 1000.0);
        acc7.withdraw(200.0);
        System.out.println(acc7.getBalance());

        // Super
        Account acc8 = new BusinessAccount(1005, "Paulo", 1000.0, 500.0);
        acc8.withdraw(200.0);
        System.out.println(acc8.getBalance());
    }
}
