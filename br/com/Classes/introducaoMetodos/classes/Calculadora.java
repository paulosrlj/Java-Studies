package br.com.Classes.introducaoMetodos.classes;

public class Calculadora {

    public void somaNumeros() {
        System.out.println(5 + 5);
    }

    public void multiplica(int n1, int n2) {
        System.out.println(n1 * n2);
    }

    public void alteraDoisNumeros(int n1, int n2){
        n1 = 30;
        n2 = 40;

        System.out.println(n1);
        System.out.println(n2);
    }

    // public void somaArray(int[] numeros){
    //     int soma = 0;

    //     for(int num: numeros)
    //         soma += num;

    //     System.out.println(soma);
    // }

    // recebe os valores e coloca no array 'numeros'
    public void somaArray(int... numeros){
            int soma = 0;
    
            for(int num: numeros)
                soma += num;
    
            System.out.println(soma);
        }
}
