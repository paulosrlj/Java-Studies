package br.com.Classes.introducaoClasses.testeClasses;

import br.com.Classes.introducaoClasses.classes.Estudante;

public class Test {
    public static void main(String[] args){
        Estudante aluno1 = new Estudante();

        aluno1.nome = "Paulo";
        aluno1.idade = 18;
        aluno1.matricula = "12578917591a";

        System.out.printf("%s, %d, %s.", aluno1.nome, aluno1.idade, aluno1.matricula);
    }
}
