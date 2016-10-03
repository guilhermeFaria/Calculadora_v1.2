package br.com.hyperclass.calculadora_v1_2.model;
/**
 * A interface <code>Operacao</code> é responsavel por efetuar a composição das operações
 * da calculadora.
 *  
 * @author Guilherme Faria
 *
 * @version 1.2.0 13/09/2016
 */
public interface Operacao {
	 public double operacao(final double valor1, final double valor2);
}