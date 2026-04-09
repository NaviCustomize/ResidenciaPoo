package pacote;

public class Operacao implements Livraria{
	
	private String tipo;
	private double valorOperacao;
	private Livro livro;
	
	public Operacao(String tipo, double valorOperacao, Livro livro) {
		this.tipo = tipo;
		this.valorOperacao = valorOperacao;
		this.livro = livro;
	}

	public String getTipo() {
		return tipo;
	}

	public double getValorOperacao() {
		return valorOperacao;
	}

	public Livro getLivro() {
		return livro;
	}

	@Override
	public String toString() {
		return "Tipo:" + tipo + ", Valor=" + valorOperacao + ", livro=" + livro;
	}

	@Override
	public void emprestarLivro() {
		
		valorOperacao = (livro.getValor() * 0.02) + taxaEmprestimo;
		
	}

	@Override
	public void venderLivro() {
		
		valorOperacao = livro.getValor() * 1.09;
		
	}
	
	
	
	
}	
