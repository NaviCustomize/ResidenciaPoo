package aula3;

public class TesteMedico {
	
	public static void main(String[]args) {
		
		Medico m1 = new Medico(1234,"Adriano",200);
		Medico m2 = new Medico(125,"Carla",400);
		Medico m3 = new Medico(234,"Carlos",260);
		
		
		System.out.println("Total de medicos: "+ Medico.getMedico());
		
		
	}
	
}
