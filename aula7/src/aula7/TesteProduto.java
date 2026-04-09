package aula7;

public class TesteProduto {
	
	public static void main(String[] args) {
		Produto produto = new Produto(1,"Celular", "Sansung A17");
		
		System.out.println(produto.toString());
		
		System.out.println("-------------------");
		System.out.println(produto.nome());
		produto.imprimir();
	}
	
	
	

	
}
