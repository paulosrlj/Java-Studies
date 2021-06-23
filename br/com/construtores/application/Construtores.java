package br.com.construtores.application;

import br.com.construtores.entities.Product;

public class Construtores {

	public static void main(String[] args) {
		Product p = new Product("Coca Cola", 6.99, 3);

		System.out.println(p.getName());
		System.out.println(p.getQuantity());
	}

}
