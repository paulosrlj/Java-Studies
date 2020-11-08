package br.com.Classes.modificadorStatic.classes;

public class Carro {
    private String nome;
    // Velocidade limite deve ser 240km/h
    private double velocidadeMaxima;
    // static -> atributo da classe e não só do objeto
    public static double velocidadeLimite = 240;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Carro() {
    }

    public void imprime() {
        System.out.println("---------------------------------");
        System.out.println(this.nome);
        System.out.println(this.velocidadeMaxima);
        // Acessa diretamente o atributo pela classe e não pela instância
        System.out.println(velocidadeLimite);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
