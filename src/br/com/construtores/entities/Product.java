package br.com.construtores.entities;

public class Product {
	/**
	 * public -> qualquer classe pode acessar
	 * private -> só a própria classe pode acessar
	 * protected -> só classes do mesmo pacote pode acessar ou subclasses
	 * sem modificador de acesso -> só podem ser acessados por classes do mesmo pacote
	 */
	
	private String name;
	private double price;
	private int quantity;

	public Product() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	// Protege a integridade do produto
//	public void setQuantity(int quantity) {
//		this.quantity = quantity;
//	}

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
}
