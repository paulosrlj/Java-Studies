package br.com.Classes.Heranca.Testes;

import br.com.Classes.Heranca.Classes.*;

public class TesteHeranca {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Paulo");
        Endereco end = new Endereco();

        p.setCpf("1279125");
        end.setBairro("Golden Park");
        end.setRua("Rua Quatro");
        p.setEndereco(end);
        p.imprime();

        System.out.println("-----------------------------");

        Funcionario f = new Funcionario("João", 3000);
        f.setCpf("89969235");
        f.setEndereco(end);
        f.imprime();
    }
}
