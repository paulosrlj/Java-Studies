package br.com.Classes.introducaoMetodos.classes;

public class Estudante {
    private String nome;
    private int idade;
    private float[] notas = new float[3];

    
    public Estudante(String nome, int idade, float[] notas){
        setNome(nome);
        setIdade(idade);
        setNotas(notas);
    }

    //setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    private void setNotas(float[] notas){
        this.notas = notas;
    }

    //getters

    public String getNome(){
        return this.nome;
    }

    public int getidade(){
        return this.idade;
    }

    public float[] getNotas(){
        return this.notas;
    }

    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("idade: " + this.idade);

        for(float n : this.notas)
            System.out.println("Notas: " + n);
    }

    public float calcNota() {
        float total = 0;
        for(float n : this.notas)
            total += n;
        return total / notas.length;
    }

}
