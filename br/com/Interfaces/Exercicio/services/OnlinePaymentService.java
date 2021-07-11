package br.com.Interfaces.Exercicio.services;

public interface OnlinePaymentService {
    float paymentFee(float amount);
    float interest(float amount, int months);
}
