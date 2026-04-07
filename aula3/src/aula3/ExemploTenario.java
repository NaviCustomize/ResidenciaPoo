package aula3;

public class ExemploTenario {
	
	public static void main(String[]args) {
		
		boolean concluida = true;
		double media = 7;
		/*
		if (concluida) {
			System.out.println("Tarefa concluida com sucesso!");
		}else {
			System.out.println("Tarefa nao concluida");
		}
		*/
		
		//System.out.println(concluida ? "Tarefa concluida com sucesso!" : "Tarefa nao concluida");
		//Media < 5 - Ruim, maior ou igual a 9 - bom, maior ou igual a 9 - otimo
		System.out.println(media < 5 ? "Ruim" :media < 9 ? "Bom": "Otimo" );
	}
	
}
