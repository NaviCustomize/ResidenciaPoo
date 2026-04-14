package pacote;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TesteVenda {
	
	public static void main(String[] args) throws Exception {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate dataCompra1 = LocalDate.parse("2002-12-07",dtf);
		LocalDate dataCompra2= LocalDate.parse("2012-08-10",dtf);
		LocalDate dataCompra3 = LocalDate.parse("2024-07-27",dtf);
		
		Produto p1 = new Produto(1,"TV",3000,Categoria.ELETRONICO);
		Produto p2 = new Produto(2,"Pneu",800,Categoria.AUTOMOTIVO);
		Produto p3 = new Produto(3,"Celular",2500,Categoria.ELETRONICO);
		
		Venda v1 = new Venda(p1,dataCompra1,1);
		Venda v2 = new Venda(p2,dataCompra2,1);
		Venda v3 = new Venda(p3,dataCompra3,1);
		
		try {
			System.out.println("Total por Item:");
			System.out.println("------------------------");
			System.out.println(v1.toString());
			System.out.println(v2.toString());
			System.out.println(v3.toString());
			System.out.println("------------------------");
			v1.calcularvenda();
			v2.calcularvenda();
			v3.calcularvenda();
			v1.mostrarVenda();
		}
		
		catch(Exception e) {
			System.err.println("Erro");
		}
		
	}
	
}
