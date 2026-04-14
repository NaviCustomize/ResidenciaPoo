package aula8;

public class ExemploOutrasException {
	
	public static void main(String[] args) {
		String fraseEntrada = "Aula de java";
		String fraseSaida = null;
		
		try {
			fraseSaida = fraseEntrada.toUpperCase();
			System.out.println(fraseSaida);
		}catch(NullPointerException e) {
			System.err.println("Erro! Nulo");
			
			e.printStackTrace();
		}
	}
	
}
