package br.com.Classes.Associacao.Classes;

public class Aluno {
    private Seminario seminario;

    private String nome;
    private int idade;
    
    public Aluno() {
    	
    }
    
	public Aluno(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	public void print() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		
		if(this.seminario != null)
			System.out.println("Seminário inscrito: " + this.seminario.getTitulo());
		else
			System.out.println("Aluno não está incrito em nenhum seminário");
	}
	
	public Seminario getSeminario() {
		return seminario;
	}
	public void setSeminario(Seminario seminario) {
		this.seminario = seminario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
