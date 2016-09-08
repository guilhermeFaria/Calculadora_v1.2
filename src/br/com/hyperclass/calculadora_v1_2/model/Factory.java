package br.com.hyperclass.calculadora_v1_2.model;

public class Factory {
	private Operacao operacao;
	public Factory(final Operacao operacao) {
		this.operacao = operacao;
	}
	public double fazCalculo(double valor1, double valor2) {
		return operacao.operacao(valor1, valor2);
	}
	public double fazSoma(final double valor1, final double valor2) {
		return new Soma().operacao(valor1, valor2);
		//return calculadora.operacao(valor1, valor2);
	}
	
	public double fazSubtracao(final double valor1, final double valor2) {
		//calculadora = new Subtracao();
		//return calculadora.operacao(valor1, valor2); Poderia ser desta forma
		return new Subtracao().operacao(valor1, valor2);
	}
	
	public double fazMultiplicacao(final double valor1, final double valor2) {
		return new Multiplicacao().operacao(valor1, valor2);
	}
	public double fazDivisao(final double valor1, final double valor2) {
		return new Divisao().operacao(valor1, valor2);
	}
}
