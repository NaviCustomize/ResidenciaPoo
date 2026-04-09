package pacote;

public class TesteAtleta {
	
	public static void main(String[] args) {
		
		Pais Brasil = new Pais("Brasil");
		Pais EUA = new Pais("EUA");
		
		Atleta atleta1 = new Atleta("Anderson", 98, Brasil);
		Atleta atleta2 = new Atleta("Carlos", 59, EUA);
		Atleta atleta3 = new Atleta("Marcelo", 110, Brasil);
		
		System.out.println(Atleta.getTotalParticipantes());
		
		System.out.println(atleta1.toString() + atleta1.verificaSituacao());
		System.out.println(atleta2.toString() + atleta2.verificaSituacao());
		System.out.println(atleta3.toString() + atleta3.verificaSituacao());
		
	}
	
}
