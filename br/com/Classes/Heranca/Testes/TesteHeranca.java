package br.com.Classes.Heranca.Testes;

import br.com.Classes.Heranca.Classes.*;

public class TesteHeranca {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Endereco end = new Endereco();

        p.setNome("Paulo");
        p.setCpf("1279125");
        end.setBairro("Golden Park");
        end.setRua("Rua Quatro");
        p.setEndereco(end);
        p.imprime();

        System.out.println("-----------------------------");

        Funcionario f = new Funcionario();
        f.setNome("João");
        f.setCpf("89969235");
        f.setSalario(3000);
        f.setEndereco(end);
        f.imprime();
    }
}
