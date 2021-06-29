package br.com.Excecoes.model.exercicio.entities;

import br.com.Excecoes.model.exercicio.exceptions.AccountExpections;

public class Account {
    private Integer number;
    private String holder;
    private float balance;
    private float withdrawLimit;

    public Account() {

    }

    public Account(Integer number, String holder, float balance, float withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public float getBalance() {
        return balance;
    }

    public float getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(float withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Float amount) {
        this.balance += amount;
    }

    public void withdraw(Float amount) throws AccountExpections {
        if(amount > withdrawLimit)
            throw new AccountExpections("The amount exceeds withdraw limit");
        if(amount > balance)
            throw new AccountExpections("Not enough balance");

        this.balance -= amount;
    }
}
