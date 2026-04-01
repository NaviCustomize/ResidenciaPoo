package teste;

public class Aluno {
	
	int matricula;
	String nome, telefone;
	int idade;
	double nota1,nota2;
	
	public void imprimir() {
		System.out.println("Bem vindo a escola");
	}
	
	public double calcularMedia() {
		return (nota1+nota2/2);
	}
		
}
