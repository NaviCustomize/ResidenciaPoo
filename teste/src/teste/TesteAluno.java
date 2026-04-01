package teste;

public class TesteAluno {
	
	public static void main(String[]args) {
		
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();
		
		
		aluno1.nome = "Jose";
		aluno2.nome = "Kenji";
		aluno3.nome = "Carlinhos";
		
		aluno1.nota1 = 10;
		aluno1.nota2 = 5;
		
		System.out.println(aluno1.nome);
		System.out.println(aluno2.nome);
		System.out.println(aluno3.nome);
		
		System.out.println("Media"+aluno1.calcularMedia());
		
	}
	
}
