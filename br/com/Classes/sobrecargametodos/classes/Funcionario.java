package br.com.Classes.sobrecargametodos.classes;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private String rg;

    // Sobrecarga de métodos nos contrutores

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public Funcionario(String nome, String cpf, double salario, String rg) {
        this(nome, cpf, salario);
        this.rg = rg;
    }

    public Funcionario() {
        
    }

    ///////////////////////////////////////////////////////////////////

    // Sobrecarga de métodos -> mesmo nome para método, mas qtd de parâmetros diferente
    /*
    public void init(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public void init(String nome, String cpf, double salario, String rg) {
        init(nome, cpf, salario);
        this.rg = rg;
    }*/

    ///////////////////////////////////////////////////////////////////

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.salario);
        System.out.println(this.rg);
    }

    public static void imprime(String algoPraimprimir) {
        System.out.println(algoPraimprimir);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public double getSalario() {
        return this.salario;
    }
}
