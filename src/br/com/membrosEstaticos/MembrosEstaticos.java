package br.com.membrosEstaticos;
import br.com.membrosEstaticos.util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class MembrosEstaticos {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println(Calculator.volume(53.2));
		System.out.println(Calculator.circuference(25.2));
		
		helloWorld();
		
		sc.close();
	}
	
	public static void helloWorld() {
		System.out.println("Hello World");
	}
}
