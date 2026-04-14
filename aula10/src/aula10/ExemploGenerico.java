package aula10;

import java.util.Arrays;
import java.util.List;

public class ExemploGenerico {
	
	public static void main(String[] args) {
		List<Integer> inteiro = Arrays.asList(10,50,30,40,12);
		List<String> cores = Arrays.asList("Azul","Vermelho","Verde","Branco");
	
		System.out.println();
		imprimirList(inteiro);
		imprimirList(cores);
	
	}
	
	public static void imprimirList(List<?> lista) {
		for (Object obj : lista) {
			System.out.println(obj);
		}
	}
	
	
	
}
