package aula9;

import java.util.Arrays;
import java.util.List;

public class ExemploArrays {
	
	public static void main(String[] args) {
		
		
		
		List produtos = Arrays.asList("Celular","Tv","Relogio","Kindle");
		
		//Array não permite adicionar ou remover dados, apenas modificar
		
		//produtos.add("Som");
		produtos.set(1, "TV 42");
		
		for (Object ob : produtos) {
			System.out.println(ob);
		}
		
	}
	
}
