package aula5;

public class TestePlano {
	
	public static void main(String[]args) {
		
		
		
		Clinica clinica = new Clinica("Amil","123456","Checkup");
		Medico medico = new Medico("Amil","122","Carlos");
		Anestesista anestesista = new Anestesista("Amil","2131","Jose","Raqui");
		
		
		
		ControlePagamento cp = new ControlePagamento();
		
		System.out.println(clinica.toString());
		System.out.println("Valor Pago Clinica: " + clinica.calcularPagamento());
		cp.calcularTotalPago(clinica);
		
		System.out.println(medico);
		System.out.println("Valor Pago Medico: " + medico.calcularPagamento());
		cp.calcularTotalPago(medico);
		
		System.out.println(anestesista);
		System.out.println("Valor Pago Anestesista: " + anestesista.calcularPagamento());
		cp.calcularTotalPago(anestesista);
		
		System.out.println("Total gasto o plano de saude: "+ cp.getTotalPago());
		
		
	}
	
}
