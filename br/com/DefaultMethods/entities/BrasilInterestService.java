package br.com.DefaultMethods.entities;

public class BrasilInterestService implements InterestService {
    private double interestRate;

    public BrasilInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

    public void hello() {
        System.out.println("Olaaaa");
    }
}
