package aula10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sorteio <T>{
	
	private List<T> lista;
	private Random random;
			
	public Sorteio(List<T> lista, Random random) {
		super();
		this.lista = lista;
		this.random = random;
		
	}
	
	public Sorteio() {
		lista = new ArrayList<>();
		random = new Random();
	}
	
	public void adicionar(T elemento) {
		lista.add(elemento);
	}
	
	public T sortiar() {
		int pos = random.nextInt(lista.size());
		return lista.get(pos);
	}
	
	
	
}
