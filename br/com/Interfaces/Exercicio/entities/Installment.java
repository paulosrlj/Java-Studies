package br.com.Interfaces.Exercicio.entities;

import java.util.Date;

public class Installment {
    private Date dueDate;
    private float amount;

    public Installment(Date dueDate, float amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
