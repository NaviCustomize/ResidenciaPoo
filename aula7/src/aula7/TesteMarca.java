package aula7;

public class TesteMarca {
	public static void main(String[] args) {
		Equipamento eq = new Equipamento(1, "mouse", Marca.APPLE);
		
		System.out.println(eq);
		
		for (Marca m : Marca.values()) {
			System.out.println(m);
		}
	}
}
