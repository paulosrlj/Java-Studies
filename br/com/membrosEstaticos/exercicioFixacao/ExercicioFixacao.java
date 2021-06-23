package br.com.membrosEstaticos.exercicioFixacao;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFixacao {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type the dolar price: ");
		float dolarPrice = sc.nextFloat();
		System.out.println("Type the dolar amount: ");
		float dolarAmount = sc.nextFloat();
		float total = CurrencyConverter.dolarToReais(dolarPrice, dolarAmount);
		
		System.out.printf("Total: %.2f", total);
		
		sc.close();
	}
}
