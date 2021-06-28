package br.com.Polimorfismo.application;
import br.com.Polimorfismo.classes.*;

public class Main {
    public static void main(String[] args) {
        Account x = new Account(1020, "Alex", 1000.0);
//        Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
        Account y = new SavingsAccount();

        x.withdraw(50.0);
        y.withdraw(50.0);
    }
}
