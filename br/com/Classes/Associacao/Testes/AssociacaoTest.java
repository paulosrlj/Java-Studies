package br.com.Classes.Associacao.Testes;

import br.com.Classes.Associacao.Classes.Aluno;
import br.com.Classes.Associacao.Classes.Seminario;
import br.com.Classes.Associacao.Classes.Professor;
import br.com.Classes.Associacao.Classes.Local;


public class AssociacaoTest {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Paulo Sérgio", 20);
		Aluno aluno2 = new Aluno("Joana D'Arc", 16);
		Seminario sem = new Seminario("Como ser programador e ficar rico?");
		Professor prof = new Professor("Yoda", "Usar a força para programar");
		Local local = new Local("Rua das Araras", "Mato");
		
//		aluno1.print();
		aluno1.setSeminario(sem);
		aluno2.setSeminario(sem);
		
		
		sem.setAlunos(new Aluno[] { aluno1, aluno2 });
		sem.setProfessor(prof);
		sem.setLocal(local);
		
		Seminario[] semArray = new Seminario[1];
		semArray[0] = sem;
		prof.setSeminarios(semArray);
		
		System.out.println("------------------------------------");
		
		sem.print();
		System.out.println("------------------------------------");
		aluno1.print();

		aluno2.print();
		
		System.out.println("------------------------------------");
		
		prof.print();
		System.out.println("------------------------------------");
		
		local.print();
	}

}
