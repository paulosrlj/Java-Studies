package br.com.vetores.application;

import java.util.Locale;
import java.util.Scanner;

import br.com.vetores.entities.Product;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i = 0; i < n; i++)
			vect[i] = sc.nextDouble();
		
		System.out.println(vect);
		
		System.out.println("///////////////////////////");
		int n2 = sc.nextInt();
		Product[] prodVect = new Product[n];	
		
		for(int i = 0; i < n2; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			prodVect[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		for(int i = 0; i < n; i++)
			sum += prodVect[i].getPrice();
		
		double avg = sum / n;
		System.out.printf("Average price = %.2f%n", avg);
		sc.close();
	}

}
