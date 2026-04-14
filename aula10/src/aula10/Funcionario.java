package aula10;

public class Funcionario {
	
	private String nome;
	private double salario;
	public Funcionario(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public double getSalario() {
		return salario;
	}
	
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", salario=" + salario + "]";
	}
	
	
	
}
