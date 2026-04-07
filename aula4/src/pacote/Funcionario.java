package pacote;

public class Funcionario {
	
	protected int matricula;
	protected String nome;
	protected String cpf;
	protected double salario;
	
	public Funcionario(int matricula, String nome, String cpf, double salario) {
		this.matricula = matricula;
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "Matricula: " + matricula + "-" + "Nome: " + nome;
	}
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	
	public boolean autenticacao(String senha) {
		return true;
	}
	
	public String imprimirContraCheque() {
		return "Impressao de contra-cheque";
	}
	
	public double reajusteSalario() {
		return 
	}
	
	
}
