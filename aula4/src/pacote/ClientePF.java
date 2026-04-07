package pacote;

public class ClientePF extends Cliente{

	private String cpf;
	private String rg;
	
	public ClientePF(String nome, int codigo, String email, String cpf, String rg) {
		super(nome, codigo, email);
		this.cpf = cpf;
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public String getRg() {
		return rg;
	}
	
}
