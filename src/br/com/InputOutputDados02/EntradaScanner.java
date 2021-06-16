package br.com.InputOutputDados02;
import java.util.Locale;
import java.util.Scanner;

public class EntradaScanner {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String s;
		// Para ler string, só lê uma palavra
		s = sc.next();
		System.out.println("Você digitou: " + s);
		
		// Para ler doubles
		// Para considerar o separador de casas decimais como ponto, use:
		// Locale.setDefault(Locale.US)
		double doubleNum = sc.nextDouble();
		System.out.printf("Você digitou: %.2f%n", doubleNum);
		
		// Ler um caracter
		char caracter = sc.next().charAt(0);
		System.out.printf("Você digitou: %.2s%n", caracter);

		// Ao ler um valor string depois de ler um char, int, double, etc ...
		// Ao apertar enter, essa quebra de linha é absorvida pelo próximo nextLine()
		// Fazendo com que ele pule uma leitura
		// Para resolver, é só colocar um nextLine() antes de fazer outra leitura
		// Ler um texto até a quebra de linha
		
		String s1, s2, s3;
		
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados digitados: ");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
	}
}
