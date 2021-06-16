package br.com.Classes.Associacao.Classes;

public class Professor {
    private Seminario[] seminarios;
    private String nome;
    private String especialidade;
    
    public Professor() {
    	
    }
    
    public Professor(String nome, String especialidade) {
    	super();
    	this.nome = nome;
    	this.especialidade = especialidade;
    }

	public Seminario[] getSeminarios() {
		return seminarios;
	}

	public void setSeminarios(Seminario[] seminarios) {
		this.seminarios = seminarios;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
    
	public void print() {
		System.out.println("Nome do professor: " + this.nome);
		System.out.println("Especialidade: " + this.especialidade);
		
		System.out.println("---Seminários participantes---");
		for(Seminario sem: this.seminarios)
			System.out.println(sem.getTitulo() + " ");
	}
}
