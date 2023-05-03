package view;
import br.edu.fateczl.lista.listaint.Lista;
import controller.ManipulaLista;

public class Main {

	public static void main(String[] args) throws Exception {
		Lista lista = new Lista();
		ManipulaLista m = new ManipulaLista();
	
		lista.addFirst(3);
		lista.add(5, 1);
		lista.add(8, 2);
		lista.add(12, 3);
		lista.add(9, 4);
		lista.add(7, 5);
		lista.add(6, 6);
		lista.add(2, 7);
		lista.add(3, 8);
		lista.add(7, 9);
		lista.add(16, 10);
		
		m.maioresLista(lista);
	}

}
