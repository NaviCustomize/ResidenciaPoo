package pacote;

public class Pessoa {
	
	private int codigo;
	private String nome;
	private double peso;
	private double altura;
	
	public Pessoa() {
		
	}

	public Pessoa(int codigo, String nome, double peso, double altura) {
		this.codigo = codigo;
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(peso > 0 && peso < 300) {
			this.nome = nome;
		}else {
			this.peso = 0;
		}
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

	public double calcularIMC(){
		
		return peso / (altura * altura);
		
	}//18.5
	public String resultado() {
		if(calcularIMC() < 18.5) {
			return "peso abaixo do normal.";
		}else if (calcularIMC() <= 24.9) {
			return "peso normal.";
		}else {
			return "peso Acima do normal.";
		}
		
		
	}
}
