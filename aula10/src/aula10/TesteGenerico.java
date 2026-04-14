package aula10;

public class TesteGenerico {
	
	public static void main(String[] args) {
		Generico<Integer> generico = new Generico(50);
		Generico<String> generico1 = new Generico("Maria");
		Generico<Boolean> generico2 = new Generico(true);
		
		System.out.println(generico.getValor());
	}
	 
}
