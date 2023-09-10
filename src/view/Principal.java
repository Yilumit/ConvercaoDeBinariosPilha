package view;

import javax.swing.JOptionPane;

import controller.ConverteController;

/*
 * 	Converte um numero decimal em binario (limitado a 1000)
 */
public class Principal {

	public static void main(String[] args) {
		ConverteController conv = new ConverteController();
		int x = (int)(Math.random()*1000)+1;
		JOptionPane.showMessageDialog(null, "Conversão de número decimal para binário");
		int numDecimal = Integer.parseInt(JOptionPane.showInputDialog("Insira um número para a conversão (Máximo: 1000): ", x));
		while (numDecimal > 1000 || numDecimal < 0) {
			JOptionPane.showMessageDialog(null, "O número precisa ser menor que 1001 e positivo!");
			numDecimal = Integer.parseInt(JOptionPane.showInputDialog("Insira um número para a conversão (Máximo: 1000): "));
		}
		String binario = conv.decToBin(numDecimal);
		JOptionPane.showMessageDialog(null, "Número convertido para binário: "+binario);
		
	}

}
