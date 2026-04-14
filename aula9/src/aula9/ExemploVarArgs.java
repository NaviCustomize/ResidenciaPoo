package aula9;

public class ExemploVarArgs {
	
	public static void main(String[] args) {
		int total = calcularSoma(10,20,30,2,50,100);
		System.out.println("Total: " + total);
	}
	
	//O varArgs aceita uma quantidade sem limite de elementos
	public static int calcularSoma(int num, int... numeros ) {
		//numeros[5] = 200;
		int soma = 0;
		
		for (int numero : numeros) {
			soma += numero;
		}
		return soma * num;
	}
	
}
