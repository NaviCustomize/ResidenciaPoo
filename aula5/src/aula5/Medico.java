package aula5;

public class Medico extends PlanoSaude{
	
	protected String nome;
	protected String crm;
	
	public Medico(String empresa, String nome, String crm) {
		super(empresa);
		this.nome = nome;
		this.crm = crm;
	}

	public String getNome() {
		return nome;
	}

	public String getCrm() {
		return crm;
	}
	
	@Override
	public String toString() {
		return super.toString() + "nome=" + nome + ", crm=" + crm;
	}
	
	@Override
	public double calcularPagamento() {
		return valorPago = super.calcularPagamento() * 1.10;
	}
	
}
