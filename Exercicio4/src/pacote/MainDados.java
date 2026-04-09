package pacote;

public class MainDados {
	
	public static void main(String[] args) {
		
		Contato contato = new Contato("Roberta",
				new Telefone[] { new Telefone("2234-1250"),new Telefone("2237-1350")}, new Endereco("Rua Fondeca Ramos 181", "Centro", "25685-110",
						new Cidade("Petropolis",
								new Estado("Rio de Janeiro", "RJ"
								)
						)
				)
		);
		
		System.out.print("Nome:"+ contato.getNome()+ "\n");
		System.out.print(contato.getEndereco()+"\n");
		contato.mostrarTelefone();	
	}
	
}
