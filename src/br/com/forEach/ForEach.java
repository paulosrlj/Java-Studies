package br.com.forEach;

public class ForEach {

	public static void main(String[] args) {
		String[] vect = new String[] {"Maria", "Paulo", "Alice"};
		
		for(String nome : vect)
			System.out.println(nome);
	}

}
