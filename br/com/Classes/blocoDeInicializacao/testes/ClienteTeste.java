package br.com.Classes.blocoDeInicializacao.testes;

import br.com.Classes.blocoDeInicializacao.classes.Cliente;

public class ClienteTeste {
    public static void main(String[] args){
        Cliente cliente = new Cliente();

        System.out.println("Exibindo a quantidade de parcelas disponíveis: ");
        for(int parcela : cliente.getParcelas())
            System.out.println(parcela + " ");
    }
}
