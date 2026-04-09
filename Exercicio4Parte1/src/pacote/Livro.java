package pacote;

public class Livro {
	
	private String autor;
	private String titulo;
	private double valor;
	
	public Livro(String autor, String titulo, double valor) {
		this.autor = autor;
		this.titulo = titulo;
		this.valor = valor;
	}

	public String getAutor() {
		return autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public double getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return "Autor:" + autor + ", Titulo:" + titulo;
	}
	
	public void reajuste(double reajusteValor) {
		
		valor = valor + valor * reajusteValor;
		
	}
	
	
	
}
