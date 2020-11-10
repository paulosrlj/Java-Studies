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

    // Métodos estáticos

    /** Não podem acessar atributos de instância (objetos), apenas atributos da própria classe
     *  Pode-se acessar um atributo estático antes da própria classe ser instânciada, afinal, são atributos de classe e não de instância
     *  Se um método não usa atributos de instância, pode colocar ele como estático
     * */

    public static double getVelocidadeLimite() {
        return Carro.velocidadeLimite;
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
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
