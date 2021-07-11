package br.com.Interfaces.Exercicio.services;

public class PaypalService implements OnlinePaymentService{

    private static final float FEE_PERCENTAGE = 0.02f;
    private static final float MONTHLY_INTEREST = 0.01f;

    @Override
    public float paymentFee(float amount) {
        return amount * FEE_PERCENTAGE;
    }

    @Override
    public float interest(float amount, int months) {
        return amount * MONTHLY_INTEREST * months;
    }
}
