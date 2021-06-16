package br.com.Strings;

public class ClasseString {
    /** Métodos úteis
     * length: retorna o tamanho ( tipo int ) de uma String.
     * charAt: retorna o caracter (char) da String que se localiza no índice passado como
        parâmetro. Vale ressalta que o primeiro índice de uma String é o índice zero
     * toUppperCase: retorna uma String com todas as letras maiúsculas a partir
        da String que chamou o método.
     * toLowerCase: retorna uma String com todas as letras minúsculas a partir da
        String que chamou o método
     * trim: retorna uma String sem espaços em branco no início e no final dela, a
        partir da String que chamou o método.

     * replace: Retorna uma String com substrings trocadas, a partir da Stringque
        chamou o método. As trocas são feitas de acordo com os parâmetros do
        método: em que aparecer a substring1 será substituída pela substring 2.

     * valueOf: retorna uma String a partir de um valor de outro tipo, como um
        número por exemplo.
     */ 

    public static void main(String[] args){
        String nome = "Paulo";
        System.out.println(nome + " Sérgio");
        System.out.println(nome.charAt(3));
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.replace("Paulo", "Lucas"));
    }
}
