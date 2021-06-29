package br.com.ClassesAbstratas.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> payers = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.print("Individual or company (i/c) ? ");
            char ic = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();

            if(ic == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpend = sc.nextDouble();

                Individual ind = new Individual(name, anualIncome, healthExpend);
                payers.add(ind);
            } else {
                System.out.print("Number of employees ");
                int empN = sc.nextInt();

                Company comp = new Company(name, anualIncome, empN);
                payers.add(comp);
            }
        }
        System.out.println();
        System.out.println("TAXES PAID: ");
        double totalTaxes = 0;

        for(TaxPayer payer : payers) {
            System.out.printf("%s: $ %.2f%n", payer.getName(), payer.calcTaxes());
            totalTaxes += payer.calcTaxes();
        }

        System.out.print("TOTAL TAXES: $ " + totalTaxes);
    }
}
