package br.com.hyperclass.calculadora_v1_2.model;

public class Factory {
	private Operacao operacao;
	public Factory(final Operacao operacao) {
		this.operacao = operacao;
	}
	public double fazCalculo(double valor1, double valor2) {
		return operacao.operacao(valor1, valor2);
	}
}
