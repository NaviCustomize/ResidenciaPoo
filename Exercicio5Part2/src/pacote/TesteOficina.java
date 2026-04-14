package pacote;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TesteOficina {
	
	public static void main(String[] args) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate dataPedido = LocalDate.parse("2002-12-07",dtf);
		
		Carro carro = new Carro("fiat uno",200,dataPedido, new Proprietario("Marcelo"));
		carro.trocarOleo();
		System.out.println(carro.toString());
	}
	
}
