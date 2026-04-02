package pacote;

import java.util.Scanner;

public class TestePessoa {
	
	
	
	public static void main(String[]args) {
		
		Pessoa p1 = new Pessoa();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Infome o seu nome: ");
		String nome = sc.next();
		
		System.out.println("Infome o seu codigo: ");
		int codigo = sc.nextInt();
		
		System.out.println("Infome o seu peso: ");
		double peso = sc.nextDouble();
		
		System.out.println("Infome a sua altura: ");
		double altura = sc.nextDouble();
		
		p1.setPeso(peso);
		p1.setAltura(altura);
		p1.setNome(nome);
		p1.setCodigo(codigo);
		p1.calcularIMC();
		
		System.out.println("Id: "+p1.getCodigo()+" "+ p1.getNome()+" tem "+p1.resultado());
		
	}
			
}
