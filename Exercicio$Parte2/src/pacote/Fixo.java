package pacote;

public class Fixo extends Vendedor{
	
	private double salarioBase;
	private double comissao;
	private double salarioBruto;
	
	public Fixo(String nome, String cpf, double salarioBase, double comissao, double salarioBruto) {
		super(nome, cpf);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
		this.salarioBruto = salarioBruto;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComisssao(double comisssao) {
		this.comissao = comisssao;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}	
	
	public void calcularSalario(double valorVenda) {
		
		double calcComissao = valorVenda * (this.comissao / 100);
		salarioBruto += calcComissao;
	}
	
	@Override
	public String toString() {
		return "Fixo [salarioBase=" + salarioBase + ", comissao=" + comissao + ", salarioBruto=" + salarioBruto + "]";
	}

}
