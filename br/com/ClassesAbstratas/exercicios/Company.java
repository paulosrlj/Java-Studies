package br.com.ClassesAbstratas.exercicios;

public class Company extends TaxPayer {
    private Integer employeesNumber;

    public Company() {

    }

    public Company(String name, Double anualIncome, Integer employeesNumber) {
        super(name, anualIncome);
        this.employeesNumber = employeesNumber;
    }

    public Integer getEmployeesNumber() {
        return employeesNumber;
    }

    public void setEmployeesNumber(Integer employeesNumber) {
        this.employeesNumber = employeesNumber;
    }

    @Override
    public Double calcTaxes() {
        double tax = employeesNumber > 10 ? 0.14 : 0.16;

        return anualIncome * tax;
    }
}
