package br.com.Classes.introducaoMetodos.testesClasses;

import br.com.Classes.introducaoMetodos.classes.Aluno;

public class alunoTeste {
    public static void main(String[] args){
        Aluno a1 = new Aluno("Paulo", 18, new float[] { 3.9f, 5.7f, 7.0f });

        a1.imprimir();
        a1.media();
    }
}
