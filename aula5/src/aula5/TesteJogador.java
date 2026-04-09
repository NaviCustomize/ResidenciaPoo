package aula5;

public class TesteJogador {
	
	public static void main(String[] args) {
		
		Time time = new Time("Flamengo","Leonardo Jardim", new Jogador[3]);
		Jogador j1 = new Jogador("Pedro", 28, "CentroAvante");
		Jogador j2 = new Jogador("Giorgian de Arrascaeta", 31, "Meia-atacante");
		Jogador j3 = new Jogador("Agustín Rossi", 30, "Goleiro titular");
		

		time.adicionarJogador(j1);
		time.adicionarJogador(j2);
		time.adicionarJogador(j3);
		time.listarJogadores();
		
	}

	
}
