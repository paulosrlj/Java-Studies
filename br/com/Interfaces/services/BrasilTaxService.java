package br.com.Interfaces.services;

public class BrasilTaxService implements TaxService {
    public double tax(double amount) {
        return amount <= 100.0 ? amount * 0.2 : amount * 0.15;
    }
}
