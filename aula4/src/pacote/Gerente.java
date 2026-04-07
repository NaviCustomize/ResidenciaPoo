package pacote;

public class Gerente extends Funcionario {
	
	private String senha;
	private String tipoDeGerente;
	private int numFuncGerenciados;
	
	public Gerente(int matricula, String nome, String cpf, double salario, String senha, String tipoDeGerente, int numFuncGerenciados) {
		super(matricula, nome, cpf,salario);
		this.senha = senha;
		this.tipoDeGerente = tipoDeGerente;
		this.numFuncGerenciados = numFuncGerenciados;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTipoDeGerente() {
		return tipoDeGerente;
	}

	public void setTipoDeGerente(String tipoDeGerente) {
		this.tipoDeGerente = tipoDeGerente;
	}

	public int getNumFuncGerenciados() {
		return numFuncGerenciados;
	}

	public void setNumFuncGerenciados(int numFuncGerenciados) {
		this.numFuncGerenciados = numFuncGerenciados;
	}
	
	

}
