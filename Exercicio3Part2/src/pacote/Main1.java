package pacote;

import java.util.Scanner;

public class Main1 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		String nome = "Kenji";
		int a = 1;
		int escolha = 1;
		
		do {
			
			if(escolha != 0) {
				System.out.println("Escolha uma das opcao: 1,2,3 ou 0");
				escolha = sc.nextInt();
			}
			
			switch (escolha){		
			
			case 1:
				while(a<=100) {
					System.out.println(a + " " + nome);
					a++;
				}
				break;
			case 2:
				do {
					System.out.println(a + " " + nome);
					a++;
				}while(a<=100);
				break;
			case 3:
				for(a=1;a<=100;a++) {
					System.out.println(a + " " + nome);
				}
				break;
			case 0:
				System.out.println("Programa encerrado com sucesso!");
				break;
			default:
				System.out.println("Error:");
				break;
			}	
		}while(escolha!=0);
		
		
	}
	
}
