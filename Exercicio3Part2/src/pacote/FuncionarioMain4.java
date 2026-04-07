package pacote;

public class FuncionarioMain4 {
	
	private String nome;
	private int telefone;
	private String email;
	private double salario;
	
	public FuncionarioMain4() {
		
	}

	public FuncionarioMain4(String nome, int telefone, String email, double salario) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	public double calcSalario() {
		return salario * 0.10;
	}
}
