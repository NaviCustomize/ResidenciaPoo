package pacote;

import java.util.Scanner;

public class main3 {
	
	public static void main(String []args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		int i =0;
		
		String[] semana =  {"Monday", "Tuesday", "Wednesday", "Thursday","Friday", "Saturday",
		"Sunday"};
		
		System.out.println("1 - while / 2 - do while / 3 - for\n");
		int escolha = sc.nextInt();
		
		switch(escolha) {
			case 1:
				while(i<=6){
					System.out.println(semana[i]);
					i++;
				}
				break;
			case 2:
				do {
					System.out.println(semana[i]);
					i++;
				}while(i<=6);
				break;
			case 3:
				for(i=0;i<=6;i++) {
					System.out.println(semana[i]);
				}
				break;
			default:
				System.out.println("Nenhum numero conhecido selecionado");
				break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
