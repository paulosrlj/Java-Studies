package br.com.Interfaces.Exercicio.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
    private int numContract;
    private Date dateContract;
    private Float total;

    private List<Installment> installments = new ArrayList<>();

    public Contract(int numContract, Date dateContract, Float total) {
        this.numContract = numContract;
        this.dateContract = dateContract;
        this.total = total;
    }

    public int getNumContract() {
        return numContract;
    }

    public Date getDateContract() {
        return dateContract;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public List<Installment> getInstallments() {
        return installments;
    }

    public void addInstallment(Installment installment) {
        this.installments.add(installment);
    }

    public void removeInstallment(Installment installment) {
        this.installments.remove(installment);
    }
}
