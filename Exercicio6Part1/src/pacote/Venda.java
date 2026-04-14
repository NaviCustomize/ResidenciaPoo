package pacote;

import java.time.LocalDate;

public class Venda implements FinalizarVenda{
	
	private Produto produto;
	private LocalDate datacompra;
	private int quantidade;
	private static double totalvenda;
	
	public Venda(Produto produto, LocalDate datacompra, int quantidade) {
		this.produto = produto;
		this.datacompra = datacompra;
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public LocalDate getDatacompra() {
		return datacompra;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public double getTotalvenda() {
		return totalvenda;
	}

	@Override
	public void calcularvenda() { //200 , 1
		//200
		Venda.totalvenda = totalvenda + produto.getValor() * quantidade;
	}
	
	@Override
	public String toString() {
		return "produto:" + produto;
	}

	public void mostrarVenda() {
		System.out.println("Total Geral Venda:"+ Venda.totalvenda);
	}
	
}
