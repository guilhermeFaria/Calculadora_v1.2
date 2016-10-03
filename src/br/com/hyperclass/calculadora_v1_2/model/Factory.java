package br.com.hyperclass.calculadora_v1_2.model;
/**
 * A classe <code>Factory</code> é a classe fabrica que ira identificar qual a 
 * classe responsavel para efetuar a operação passada pelo client.
 * 
 * @author Guilherme Faria
 *
 * @version 1.2.0 13/09/2016
 */
public class Factory {
	private Operacao operacao;
	public Factory(final Operacao operacao) {
		this.operacao = operacao;
	}
	public double fazCalculo(final double valor1, final double valor2) {
		return operacao.operacao(valor1, valor2);
	}
}
