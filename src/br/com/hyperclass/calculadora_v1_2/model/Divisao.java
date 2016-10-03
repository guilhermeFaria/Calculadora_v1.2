package br.com.hyperclass.calculadora_v1_2.model;

/**
 * A classe <code>Divisao</code> � a classe responsavel por efetuar
 * a divis�o dos valores recebidos e retornar o seu resultado.
 * 
 * @author Guilherme Faria
 *
 * @version 1.2.0 13/09/2016
 */

public class Divisao implements Operacao {

	@Override
	public double operacao(final double valor1, final double valor2) {
		return valor1/valor2;
	}

}
