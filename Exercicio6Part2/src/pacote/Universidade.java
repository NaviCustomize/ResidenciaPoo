package pacote;

public abstract class Universidade {
	
	private String nome;

	public Universidade(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Universidade [nome=" + nome + "]";
	}
	
	public abstract void fazerMatricula();
	
}
