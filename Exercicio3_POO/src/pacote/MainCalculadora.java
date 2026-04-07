package pacote;

import java.util.Scanner;

public class MainCalculadora {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		Calculadora c1 = new Calculadora();
		
		int escolha=0;
		do {
			
		System.out.println("1 - Soma\n2 - Subtracao\n3 - Multiplicacao\n4 - Divisao\n5 - Sair\n");
		escolha = sc.nextInt();
			
			if(escolha != 5) {
				System.out.println("Escolha o 1 numero: ");
				int num1 = sc.nextInt();
				
				System.out.println("Escolha o 2 numero: ");
				int num2 = sc.nextInt();
			
				switch (escolha) {
					
					case 1:
						System.out.println(c1.soma(num1,num2));
						break;
					case 2:
						System.out.println(c1.subtracao(num1,num2));
						break;
					case 3:
						System.out.println(c1.multiplicacao(num1,num2));
						break;
					case 4:
						System.out.println(c1.divisao(num1,num2));
						break;
					default:
						System.out.println("Informe um numero valido: ");
						break;
				}
			}
		}while(escolha!=5);
		System.out.println("Programa encerrado com sucesso!");
	}
}
