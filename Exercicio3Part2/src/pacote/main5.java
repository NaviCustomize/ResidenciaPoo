package pacote;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class main5 {
	
	public static void main(String[]args) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o numero: ");
		int numero = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Informe a data do pedido: ");
		LocalDate dataPedido = LocalDate.parse(sc.nextLine(),dtf);
		
		System.out.println("Informe a quantidade: ");
		int quantidade = sc.nextInt();
		
		System.out.println("Informe o valor: ");
		double valor = sc.nextDouble();
		
		PedidoMain5 p1 = new PedidoMain5(numero, dataPedido, quantidade, valor);
		
		System.out.println("Total do pedido: "+ p1.getTotal());
		
		sc.close();
	}
	
}
