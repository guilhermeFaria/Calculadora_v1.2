package br.com.hyperclass.calculadora_v1_2.model;

public class Subtracao implements Operacao {

	@Override
	public double operacao(double valor1, double valor2) {
		return valor1-valor2;
	}

}
