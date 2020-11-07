package br.com.Classes.introducaoMetodos.classes;

public class Aluno {
    public String nome;
    public int idade;
    public float[] notas = new float[3];

    public Aluno(String nome, int idade, float[] notas) {
        this.nome = nome;
        this.idade = idade;
        this.notas = notas;
    }

    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("idade: " + this.idade);

        for(float n : this.notas)
            System.out.println("Notas: " + n);
    }

    public void media() {
        float media = 0;

        for(float n : this.notas)
            media += n;

        media /= this.notas.length;

        if(media > 6)
            System.out.println("Aprovado");
        else
            System.out.println("Reprovado");
    }
}
