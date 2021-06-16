package br.com.Classes.modificadorStatic.testes;

import br.com.Classes.modificadorStatic.classes.Pokemon;

public class PokemonTeste {
    public static void main(String[] args) {
        Pokemon bulbasaur = new Pokemon("Bulbasaur",  new String[] {"Grama", "Elétrico"});

        Pokemon torterra = new Pokemon();
        torterra.setNome("Torterra");
        torterra.setTipos(new String[] {"Grama", "Terra"});
        System.out.println(torterra.getNome());
        torterra.imprimeTipos();

        System.out.println(Pokemon.getMaxLevel());

        System.out.println(bulbasaur.getTipos()[0]);

        bulbasaur.imprimeTipos();
    }
}
