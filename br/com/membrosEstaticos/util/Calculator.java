package br.com.membrosEstaticos.util;

public class Calculator {
	// final não deixa o valor mudar mais (constante)
	public static final double PI = 3.14159;
	
	public static double circuference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}
