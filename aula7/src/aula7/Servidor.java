package aula7;

public class Servidor {
	
	protected String cpf;
	protected String nome;
	protected final String locacao;
	
	public Servidor(String cpf, String nome, String locacao) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.locacao = locacao;
	}

	public String getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public String getLocacao() {
		return locacao;
	}

	public final void imprimirDados() {
		System.out.println("Dados dos servidores");
	}
	
}
