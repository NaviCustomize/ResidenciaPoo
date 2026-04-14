package aula9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExemploGenerics {
	
	public static void main(String[] args) {
		List<Funcionario> funcionarios = new ArrayList<>();
		
		
		Set<String> cores = new HashSet<>();
		funcionarios.add(new Funcionario("Marcelo", "Programador", 9000));
		funcionarios.add(new Funcionario("Mariana", "Programador", 9000));
		
		funcionarios.get(1).abono(200);
		
		for (Funcionario funcionario : funcionarios) {
			System.out.println(funcionario);
		}
	}
	
}
