package aula5;

public class Imovel {
	
	private String tipo;
	private double valor;
	private String endereco;
	//relacionamento entre classes
	private Proprietario proprietario;
	
	
	public Imovel(String tipo, String endereco ,double valor, Proprietario proprietario) {
		super();
		this.tipo = tipo;
		this.endereco = endereco;
		this.valor = valor;
		this.proprietario = proprietario;
	}

	public String getTipo() {
		return tipo;
	}

	public double getValor() {
		return valor;
	}

	public String getEndereco() {
		return endereco;
	}

	public Proprietario getProprietario() {
		return proprietario;
	}

	@Override
	public String toString() {
		return "tipo=" + tipo + ", valor=" + valor + ", endereco="
				+ endereco + ", proprietario=" + proprietario;
	}
	
	
	
}
