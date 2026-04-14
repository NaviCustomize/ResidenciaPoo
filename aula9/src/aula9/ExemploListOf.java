package aula9;

import java.util.List;

public class ExemploListOf {
	
	public static void main(String[] args) {
		List produtos = List.of("Celular", "Tv", "Relogio");
		
		//Nao aceita novos elementos
		//produtos.add("Pen drive")
		//Nao aceita modificadores nos elementos da lista
		//produtos.set(0, "Celular da apple");
		
		for (Object o : produtos) {
			System.out.println(o);
		}
	}
	
}
