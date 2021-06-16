package br.com.Classes.Heranca.Classes;

/* 
 * imprime sobrescreve o imprime da classe Pessoa (sobrescrita) (o numero de parâmetros precisa
 * ser igual
 * */

public class Funcionario extends Pessoa {

    private double salario;

    public Funcionario(String nome, double salario) {
        super(nome);
        this.salario = salario;
    }

    public void sobrescritaTeste(String msg) {
    	super.sobrescritaTeste();
    	System.out.println("Sobrescrito");
    }
    
    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
        imprimeReciboPagamento();
    }

    public void imprimeReciboPagamento() {
        System.out.println("Eu " + this.nome + " recebi o pagamento de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
