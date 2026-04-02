package pacote;

import java.util.Scanner;

public class TesteConta {
	public static void main(String[]args) {
		
		double valor,saque = 0; 
		int numero,a=0;
		String nome;
		
		Scanner sc = new Scanner(System.in);
		Conta conta = new Conta();
		
		do{
			System.out.println("Digite o n da conta");
			 numero = sc.nextInt();
			
			System.out.println("Digite seu nome");
			nome = sc.next();
			
			System.out.println("Digite o valor do deposito");
			valor = sc.nextDouble();
			conta.depositar(valor);
			
			System.out.println("Digite o valor do saque");
			 saque = sc.nextDouble();
			 
			 System.out.println("Deseja continuar? 1 = sim / 0 = nao");
			 a = sc.nextInt();
		
			
		
		if(conta.saque(saque)) {
			System.out.println("Saque efetuado");
		}else {
			System.out.println("Saque nao efetuado");
		}
		System.out.println("Saldo atual: "+conta.getSaldo());
		}while(a != 0);
	}
	
}
