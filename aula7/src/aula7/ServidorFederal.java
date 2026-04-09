package aula7;

public class ServidorFederal extends Servidor{
	
	private String matricula;

	public ServidorFederal(String cpf, String nome, String locacao, String matricula) {
		super(cpf, nome, locacao);
		this.matricula = matricula;
	}
	
	
	
}
