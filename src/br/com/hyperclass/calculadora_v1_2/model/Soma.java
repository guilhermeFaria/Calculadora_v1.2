package br.com.hyperclass.calculadora_v1_2.model;

public class Soma implements Operacao {
	
	@Override
	public double operacao(final double valor1, final double valor2) {
		return valor1+valor2;
	}

}
