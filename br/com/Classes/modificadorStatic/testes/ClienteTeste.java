package br.com.Classes.modificadorStatic.testes;

import br.com.Classes.modificadorStatic.classes.Cliente;

public class ClienteTeste {
    public static void main(String[] args){
        // Ao entrar na classe pela primeira vez, executa os blocos estáticos uma unica vez
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        Cliente c3 = new Cliente();

        System.out.println("Exibindo a quantidade de parcelas disponíveis: ");
//        for(int parcela : cliente.getParcelas())
//            System.out.println(parcela + " ");

        System.out.println("Tamanho: " + Cliente.getParcelas().length);
    }
}
