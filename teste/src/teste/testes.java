package teste;

public class testes {
	
	public static void main(String []args) {
		
		//tipos primitivos
		int idade = 30;
		double altura = 1.6;
		boolean ativo = true;
		char opcao = 'S';
		
		
		//Tipos derivados
		String nome = "Jose";
		Integer matricula;
		nome.toUpperCase();
		
		if(idade >= 18 || altura >=1.70) {
			System.out.println("O atleta competira!");
		}else {
			System.out.println("OO atleta nao competira!");
		}
	}
	
}
