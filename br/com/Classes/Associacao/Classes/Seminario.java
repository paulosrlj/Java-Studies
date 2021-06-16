package br.com.Classes.Associacao.Classes;

public class Seminario {
    private Aluno[] alunos;
    private Professor professor;
    private Local local;

    private String titulo;
    
    public Seminario() {
    	
    }
    
    public Seminario(String titulo) {
    	this.titulo = titulo;
    }
    
    public void print() {
    	System.out.println("Título: " + this.titulo);
    	System.out.println("Alunos do seminário: ");
    	for(Aluno al: this.alunos)
    		System.out.println(al.getNome());
    	System.out.println("Local: " + this.local.getRua());
    	System.out.println("Professor: " + this.professor.getNome());
    }

	public Aluno[] getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	

}
