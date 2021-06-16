package br.com.Classes.Associacao.Classes;

public class ClasseTeste {
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public ClasseTeste() {
		
	}
	
	public ClasseTeste(String msg) {
		System.out.println(msg);
	}
}
