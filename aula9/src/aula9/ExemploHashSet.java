package aula9;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploHashSet {
	
	public static void main(String[] args) {
		
		//Set nao imprime duplicada
		//Set produtos = new LinkedHashSet<>(); //Ordena na ordem do comando
		Set produtos = new TreeSet<>(); //Ordena em ordem alfabetica
		//Set produtos = new HashSet<>();
		produtos.add(new String("Celular"));
		produtos.add("Celular");
		produtos.add("Tv");
		produtos.add("Som");
		produtos.add("celular");
		
		for (Object ob : produtos) {
			System.out.println(ob);
		}
	}
}
