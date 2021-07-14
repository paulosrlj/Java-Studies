package br.com.DefaultMethods;

import br.com.DefaultMethods.entities.*;

public class Main {
    public static void main(String[] args) {
        InterestService is = new BrasilInterestService(1.5);
    }
}
