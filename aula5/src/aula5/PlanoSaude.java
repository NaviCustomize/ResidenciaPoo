package aula5;

public class PlanoSaude {
	
	protected String empresa;
	protected double valorPago = 80;
	protected double valorISS = 5;
	
	public PlanoSaude(String empresa) {
		this.empresa = empresa;
	}

	public String getEmpresa() {
		return empresa;
	}

	public double getValorpago() {
		return valorPago;
	}

	public double getValorISS() {
		return valorISS;
	}
	
	@Override
	public String toString() {
		return "empresa=" + empresa + ", valorpago=" + valorPago + ", valorISS=" + valorISS;
	}
	
	public double calcularPagamento() {
		return valorPago = valorPago - valorPago * valorISS / 100;
	}
	
}
