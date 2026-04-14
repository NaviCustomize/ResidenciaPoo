package pacote;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteCliente {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Cliente> cliente = new ArrayList<>();
			
		
		while(true) {
			System.out.println("Qual o id?");
			int id = sc.nextInt();
			sc.nextLine();
			
			if(id <0) {
				break;
			}
			
			System.out.println("Qual o nome?");
			String nome = sc.nextLine();
			
			
			System.out.println("Qual a idade?");
			int idade = sc.nextInt();
			sc.nextLine();
			System.out.println("Qual o telefone?");
			int telefone = sc.nextInt();
			
			cliente.add(new Cliente(id,nome,idade,telefone));
		}
		
		for (Cliente cl : cliente) {
			System.out.println(cl);
		}
		
	}
	
}
