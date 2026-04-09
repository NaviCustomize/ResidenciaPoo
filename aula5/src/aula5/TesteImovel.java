package aula5;

public class TesteImovel {

	public static void main(String[] args) {
		
		Proprietario p1 = new Proprietario(1,"Arthur");
		Proprietario p2 = new Proprietario(2,"Carol");
		
		Imovel imovel1 = new Imovel("Casa","Rua Binger",195000, p1);
		Imovel imovel2 = new Imovel("Apto","Rua Fonseca",250000, p2);
		
		System.out.println(imovel1);
        System.out.println(imovel2);
		
	}
	
}
