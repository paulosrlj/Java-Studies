package br.com.Interfaces.Exercicio.application;

import br.com.Interfaces.Exercicio.entities.Contract;
import br.com.Interfaces.Exercicio.entities.Installment;
import br.com.Interfaces.Exercicio.services.InstallmentService;
import br.com.Interfaces.Exercicio.services.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter contract data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Date (dd/MM/yyyy): ");
        Date date = sdf.parse(sc.nextLine());
        System.out.print("Contract value: ");
        float contractValue = sc.nextFloat();
        System.out.print("Enter number of installments: ");
        int installments = sc.nextInt();

        Contract contract = new Contract(number, date, contractValue);

        InstallmentService installmentService = new InstallmentService(new PaypalService());
        installmentService.calcInstallment(contract, installments);

        System.out.println("Installments: ");
        for (Installment i : contract.getInstallments()) {
            System.out.println(sdf.format(i.getDueDate()) + " - " + i.getAmount());
        }
    }
}
