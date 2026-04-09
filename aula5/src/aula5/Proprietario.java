package aula5;

public class Proprietario {
	
	private int id;
	private String nome;
	
	public Proprietario(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "id=" + id + ", nome=" + nome;
	}
	
	
	
}
