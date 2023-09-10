package controller;

import model.PilhaInt;

public class ConverteController {

	public String decToBin(int decimal) {
		PilhaInt p = new PilhaInt();
		String numBinario = "";
		
		while (decimal >= 2) {
			p.push(decimal%2);	//Adiciona o resto da divisao por 2 a pilha 
			decimal /= 2;	
		}
		p.push(decimal);	//Adiciona uma ultima vez o valor da divisao do numero por 2
		
		int tamanho = p.size();	//Retorna o tamanho da pilha
		for (int i = 0; i < tamanho; i++) {
			try {
				numBinario += p.pop();	//Concatena o valor do topo da pilha
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
			
			return numBinario;	//Retorna o numero binario
	}

}
