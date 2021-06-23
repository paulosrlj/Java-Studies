package br.com.pooIntroducao;

public class Triangle {
	public String name = "Triangle";
	public double a;
	public double b;
	public double c;
	
	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
	
	// Sobrepondo a versão padrão do toString de Object
	public String toString() {
		return name
		+ " a: " + String.format("%.2f%n",  a) 
		+ "b: " + String.format("%.2f%n",  b)
		+ "c: " + String.format("%.2f%n",  c);
	}
}
