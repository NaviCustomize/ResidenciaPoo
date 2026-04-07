package aula3;

public class Medico {
	
	
	
	private int crm;
	private String nome;
	private double valorConsulta;
	private static int contMedicos;
	
	public Medico(int crm, String nome, double valorConsulta) {
		this.crm = crm;
		this.nome = nome;
		this.valorConsulta = valorConsulta;
		contMedicos++;
	}
	
	public static int getMedico() {
		return contMedicos;
	}
	
	public int getCrm() {
		return crm;
	}
	public void setCrm(int crm) {
		this.crm = crm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValorConsulta() {
		return valorConsulta;
	}
	public void setValorConsulta(double valorConsulta) {
		this.valorConsulta = valorConsulta;
	}
	
	
}
