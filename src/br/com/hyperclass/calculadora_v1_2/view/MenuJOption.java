package br.com.hyperclass.calculadora_v1_2.view;
import br.com.hyperclass.calculadora_v1_2.model.*;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class MenuJOption {
	private int cont =0;
	private Map<Integer, Operacao> operacoes;
	private int valor1, valor2;
	
	public MenuJOption() {
		operacoes = new HashMap<Integer, Operacao>();
		operacoes.put(1, new Soma());
		operacoes.put(2, new Subtracao());
		operacoes.put(3, new Multiplicacao());
		operacoes.put(4, new Divisao());
	}
	
	public void menu() {
		while(cont!=5){
			JOptionPane.showMessageDialog(null,"Calculadora v2.0", "Calculadora 2.0", 1);
			cont = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - Soma"
					+ "\n2 - Subtração"
					+ "\n3 - Multiplicação"
					+ "\n4 - Divisão"
					+ "\n5 - Sair"));
			if (cont!=5) {
				identificaOpcao(cont);
			}else {
				JOptionPane.showMessageDialog(null, "Obrigado por utilizar nossos Sistemas!");
				System.exit(0);
			}
		}
	}
	private void identificaOpcao(int opcao) {
		valor1=Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
		valor2=Integer.parseInt(JOptionPane.showInputDialog("Digite o outro valor:"));
		JOptionPane.showMessageDialog(null, "O resultado desta Operação é de "
		+new Factory(operacoes.get(opcao)).fazCalculo(valor1, valor2));
	}
}	