package aula5;

public class Anestesista extends Medico{
	
	private String tipoAnestesia;

	public Anestesista(String empresa, String nome, String crm,
			String tipoAnestesia) {
		super(empresa,nome, crm);
		this.tipoAnestesia = tipoAnestesia;
	}

	public String getTipoAnestesia() {
		return tipoAnestesia;
	}

	@Override
	public String toString() {
		return super.toString() +"Anestesista [tipoAnestesia=" + tipoAnestesia;
	}

	@Override
	public double calcularPagamento() {
		return valorPago = super.calcularPagamento() + 1500;
	}
	
}
