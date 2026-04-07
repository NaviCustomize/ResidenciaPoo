package pacote;

import java.util.Scanner;

public class MainProduto {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		char a = 's';
		
		
		do {
			System.out.println("Produto:\n");
			String descricao = sc.next();
			
			System.out.println("Valor:\n");
			Double valor = sc.nextDouble();
			
			System.out.println("Quantidade:\n");
			int quantidade = sc.nextInt();
			
			Produto p1 = new Produto(descricao, valor, quantidade);
			
			System.out.println("descricao:"+ p1.getDescricao()+"\nValor"+ p1.getValor()+"\nTotal:"+ p1.total()+"\nICMS"+p1.calcularIcms());
			
			System.out.println("Deseja encerrar o programa? (S/N) ");
			a = sc.next().charAt(0);
			
			
		}while(a == 'S' || a == 's');
		sc.close();
	}
	
	
	
}
