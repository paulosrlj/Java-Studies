package br.com.HashCodeEEquals.application;

import br.com.HashCodeEEquals.entities.Client;

public class Main {
    public static void main(String[] args) {
        /*
         hashCode e Equals são operações da class Object para comparar
         se um objeto é igual a outro
           Equals -> lento, resposta 100%
           hashCode -> rápido, porém resposta positiva não é 100%
         */

        String a = "Maria";
        String b = "Alex";
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Paulo", "paulo@gmail.com");
        Client c3 = new Client("Maria", "paulo@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c3));
    }
}
