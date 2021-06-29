package br.com.ClassesAbstratas.exercicios;

public class Individual extends TaxPayer {

    private Double healthExpenditures;

    public Individual() {

    }

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double calcTaxes() {
        double tax = anualIncome < 20000.00 ? 0.15 : 0.25;

        return (anualIncome * tax) - (healthExpenditures * 0.5);
    }


}
