package pacote;

import java.util.Scanner;

public class main2 {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int[] valor = new int[3];
		
		for(int i = 0;i<3;i++) {
			System.out.println("Esolha o  "+ (i+1) +" numero");
			valor[i] = sc.nextInt();
		}

		for(int i = 0;i<3;i++) {
			System.out.println("numero "+i+" com o valor"+valor[i]);
		}
		
		//3 2 1
		int maior = (valor[0]> valor[1]) ? (valor[0] > valor[2] ? valor[0] : valor[2]) : (valor[1] > valor[2] ? valor[1] : valor[2]);
		
		System.out.println("O maior numero é o valor "+ maior);
		
	}
	
}
