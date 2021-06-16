package br.com.membrosEstaticos.exercicioFixacao;

public class CurrencyConverter {
	public static float dolarToReais(float dolarPrice, float dolarAmount) {
		float reais = (dolarPrice * dolarAmount);
		return (reais * 0.06f) + reais;
	}
}
