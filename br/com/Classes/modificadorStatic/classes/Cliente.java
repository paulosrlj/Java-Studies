package br.com.Classes.modificadorStatic.classes;

public class Cliente {
    // 0 - bloco estático
    // 1 - Alocado espaço na memória para o objeto que será criado;
    // 2 - Cada atributo da classe é criado e inicializado com seus valores default ou valores explicitos
    // 3 - Bloco de inicialização é executado
    // 4 - O contrutor é executado 
    
    private static int[] parcelas;

    public Cliente(){}

    // Primeira coisa a ser executada
    static {
        parcelas = new int[100];

    

        System.out.println("Dentro do bloco de inicialização");
        for(int i = 1; i <= 100; i++)
            parcelas[i-1] = i;
    }

//    {
//        parcelas = new int[100];
//        System.out.println("Dentro do bloco de inicialização");
//        for(int i = 1; i <= 100; i++)
//            parcelas[i - 1] = i;
//    }

    public static int[] getParcelas() {
        return parcelas;
    }

    public static void setParcelas(int[] parcelas) {
        Cliente.parcelas = parcelas;
    }


    
}
