package pacote;

public class Cliente {
	
	protected String nome;
	protected int codigo;
	protected String email;
	
	public Cliente(String nome, int codigo, String email) {
		this.nome = nome;
		this.codigo = codigo;
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getEmail() {
		return email;
	}
		
}
