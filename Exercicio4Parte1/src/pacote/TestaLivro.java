package pacote;

public class TestaLivro {
	
	public static void main(String[] args) {
		
		Livro l1 = new Livro("Marco Antonio", "Cisco CCNA", 85);
		Livro l2 = new Livro("Kathy Sierra","Use a Cabeca Java",95);
		
		Operacao op1 = new Operacao("Venda", 85, l1);
		Operacao op2 = new Operacao("Emprestimo", 95, l2);
		
		l1.reajuste(0.06);
		
		
		op1.venderLivro();
		op2.emprestarLivro();
		
		
		
		System.out.println(op1.toString());
		System.out.println(op2.toString());
		
		
	}
	
}
