package pacote;

import java.util.Scanner;

public class MainExercicio4 {
	
	public static void main(String[] args) {
		char a;
		double valorTotal =0;
		Scanner sc = new Scanner(System.in);
		
		Fixo fx1 = new Fixo("Joana", "12345678960", 2000, 3, 2000);
		Fixo fx2 = new Fixo("Maria", "23467845690", 2000, 3, 2000);
		
		do {
			System.out.println("-----------Sistema de Vendas-----------");
			
			System.out.println("Vendedores: \n1-Joana\n2-Maria\nEscolha o vendedor:\n");
			int escolha = sc.nextInt();
			
			System.out.println("Digite o valor da venda: ");
			double valorVenda = sc.nextDouble();
			
			
			switch (escolha) {
				case 1:
					
					fx1.calcularSalario(valorVenda);  //2090
					valorTotal += valorVenda;
					break;
				case 2:
					fx2.calcularSalario(valorVenda);
					valorTotal += valorVenda;
					break;
				default:
					System.out.println("\nValor Incorreto.\nVendedores: \n1-Joana\n2-Maria\nEscolha o vendedor:\n");
					break;
			}
			
			System.out.println("Deseja encerrar o programa? (S/N)");
			a = sc.next().charAt(0);
		}while(a=='N' || a=='n');
	
		
		System.out.println("-----------Salario dos Vendedos:-----------");
		
		System.out.println("Nome"+ fx1.getNome()+ "\n" + "Salario Bruto: " + fx1.getSalarioBruto()+"\n");
		System.out.println("Nome"+ fx2.getNome()+ "\n" + "Salario Bruto: " + fx2.getSalarioBruto()+"\n");
		System.out.println("-----------Total Vendido:-----------");
		System.out.println("Total:"+ valorTotal);
		
	}
	
}
