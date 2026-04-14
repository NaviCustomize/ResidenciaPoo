package aula10;

public class TesteSorteio {
	
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Joao",2000);
		Funcionario f2 = new Funcionario("Maria",4000);
		Funcionario f3 = new Funcionario("Adriana",2000);
		Funcionario f4 = new Funcionario("Carlos",3000);
		
		Sorteio<Funcionario> sorteio = new Sorteio<>();
		sorteio.adicionar(f1);
		sorteio.adicionar(f2);
		sorteio.adicionar(f3);
		sorteio.adicionar(f4);
		
		System.out.println(sorteio.sortiar());
		
		Sorteio<String> sorteio2 = new Sorteio<>();
		sorteio2.adicionar("Celular");
		sorteio2.adicionar("Som");
		sorteio2.adicionar("Tv");
		System.out.println("O equipamento sorteado foi:"+ sorteio2.sortiar());
		
	}
	
}
