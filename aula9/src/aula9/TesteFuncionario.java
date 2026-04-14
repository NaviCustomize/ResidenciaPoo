package aula9;

public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario[] funcionario1 = new Funcionario[2];
		
		
		
		funcionario1[0] = new Funcionario ("kenji","gerente",2000);
		funcionario1[1] = new Funcionario ("Joao","chefe",1000);
		
		funcionario1[0].abono(200);
		funcionario1[1].abono(100);
		
		for (Funcionario func : funcionario1) {
			System.out.println(func);
		}	

	}
	
}
