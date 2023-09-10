package view;

import javax.swing.JOptionPane;

import controller.ConverteController;

/*
 * 	Converte um numero decimal em binario (limitado a 1000)
 */
public class Principal {

	public static void main(String[] args) {
		ConverteController conv = new ConverteController();
		int x = (int)(Math.random()*1000)+1;	//Número aleatorio inteiro ate 1000
		
		JOptionPane.showMessageDialog(null, "Conversão de número decimal para binário");
		//Inserçao de um numero para ser convertido
		int numDecimal = Integer.parseInt(JOptionPane.showInputDialog("Insira um número para a conversão (Máximo: 1000): ", x));
		
		
		while (numDecimal > 1000 || numDecimal < 0) {	//Verifica se o numero e valido para ser convertido
			JOptionPane.showMessageDialog(null, "O número precisa ser menor que 1001 e positivo!");
			//Proxima tentativa de inclusao de um numero para ser convertido
			numDecimal = Integer.parseInt(JOptionPane.showInputDialog("Insira um número para a conversão (Máximo: 1000): "));
		}
		String binario = conv.decToBin(numDecimal); //Envia o numero inteiro como parametro e recebe sua conversao para binario em String
		JOptionPane.showMessageDialog(null, "Número convertido para binário: "+binario);
		
	}

}
