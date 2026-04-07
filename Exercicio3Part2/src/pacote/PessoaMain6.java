package pacote;

public class PessoaMain6 {
	
	private String nome;
	private double peso;
	private double altura;
	
	public static int pessoa;
	public PessoaMain6(String nome, double peso, double altura) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
		pessoa++;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public static int getPessoa() {
		return pessoa;
	}
	public static void setPessoa(int pessoa) {
		PessoaMain6.pessoa = pessoa;
	}
	
	

	
	
}

