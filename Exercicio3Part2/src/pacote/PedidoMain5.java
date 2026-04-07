package pacote;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class PedidoMain5 {
	
	private int numero;
	private LocalDate dataPedido;
	private double quantidade;
	private double valor;
	private double total;


	public PedidoMain5(int numero, LocalDate dataPedido, double quantidade, double valor) {
		this.numero = numero;
		this.dataPedido = dataPedido;
		this.quantidade = quantidade;
		this.valor = valor;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public LocalDate getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(LocalDate dataPedido) {
		this.dataPedido = dataPedido;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getTotal() {
		return total = quantidade * finalizarPedido();
	}
	
	public double finalizarPedido() {
		if(dataPedido.getDayOfWeek() == DayOfWeek.SUNDAY) {
			return valor = valor * 0.90;
		}
		
		return valor;
	}
	
	
	
	
}
