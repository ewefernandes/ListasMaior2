package controller;

import br.edu.fateczl.lista.listaint.Lista;

public class ManipulaLista {

	public void maioresLista(Lista l) throws Exception {
		//São feitas duas rodadas de bubble sort para saber os 2 maiores valores da lista
		
		int tamLista = l.size();
		
		for (int i = 0; i < 2; i ++) { //Determina as 2 rodadas
			for (int c = 0; c < tamLista-1; c ++) {
				int v = l.get(c);
				int v1 = l.get(c+1);
				if (v > v1) { //Condição para trocar os valores da lista
					l.remove(c);
					l.add(v1, c);
					l.remove(c+1);
					l.add(v, c+1);
				}
			}
		}
		
		System.out.println(l.toString());
	}
}
