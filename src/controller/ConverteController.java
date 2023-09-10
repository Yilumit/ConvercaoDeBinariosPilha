package controller;

import model.PilhaInt;

public class ConverteController {

	public String decToBin(int decimal) {
		PilhaInt p = new PilhaInt();
		String numBinario = "";
		
		while (decimal >= 2) {
			p.push(decimal%2);
			decimal /= 2;
		}
		p.push(decimal);
		
		int tamanho = p.size();
		for (int i = 0; i < tamanho; i++) {
			try {
				numBinario += p.pop();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
			
			return numBinario;
	}

}
