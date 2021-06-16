package br.com.Classes.modificadorStatic.classes;

public class Pokemon {
    public static int maxLevel = 100;

    String nome;
    String[] tipos;

    public Pokemon(String nome, String[] tipos) {
        this.nome = nome;
        this.tipos = tipos;
    }

    public Pokemon() {}

    public static int getMaxLevel() {
        return maxLevel;
    }

    public static void setMaxLevel(int maxLevel) {
        Pokemon.maxLevel = maxLevel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String[] getTipos() {
        return tipos;
    }

    public void setTipos(String[] tipos) {
        this.tipos = tipos;
    }

    public void imprimeTipos() {
        for(String tipo : this.tipos) {
            System.out.println(tipo);
        }
    }
}
