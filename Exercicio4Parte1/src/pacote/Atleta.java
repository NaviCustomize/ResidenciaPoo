package pacote;

public class Atleta implements Olimpiadas{
	
	private String nome;
	private double peso;
	private String modalidade;
	private static int totalParticipantes = 0;
	private Pais pais;
	
	public Atleta(String nome, double peso, Pais pais) {
		this.nome = nome;
		this.peso = peso;
		this.pais = pais;
		totalParticipantes++;
	}

	public String getNome() {
		return nome;
	}

	public double getPeso() {
		return peso;
	}
	
	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}
	
	public String getModalidade() {
		return modalidade;
	}
	
	public static int getTotalParticipantes() {
		return totalParticipantes;
	}
	
	public Pais getPais() {
		return pais;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + ", Peso: " + peso + ", Pais: " + pais;
	}

	@Override
	public String verificaSituacao() {
		if(peso >= 60 && peso< 90 ) {
			totalParticipantes++;
		}
		return peso > 90? " Peso pesado, Participara!":peso >= 60 && peso <= 90? " Peso medio, Participara!": " Peso leve, Nao Participara!";
	}
	
}
