package br.com.Classes.sobrecargametodos.teste;

import br.com.Classes.sobrecargametodos.classes.Funcionario;

public class funcionarioTeste {
    public static void main(String[] args){
        Funcionario funcionario = new Funcionario("Paulo", "500.422.648-11", 2150.44, "122-614");

        funcionario.imprime();
    }
}
