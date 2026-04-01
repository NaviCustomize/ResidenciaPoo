package teste;

import java.util.Scanner;

public class Exemplo2 {
	public static void main(String[]args) {
		
		String dia = "Domingo";
		
		String resultado = switch (dia){
			
			case "Segunda"-> "Dia da semana";
			case "Terca"-> "Dia da semana";
			case "Quarta"-> "Dia da semana";
			case "Quinta"-> "Dia da semana";
			case "Sexta"-> "Dia da semana";
			case "Sabado"-> "Fim da semana";
			case "Domingo"-> "Fim da semana";
			default-> "Dia invalido";
		};
		
		System.out.println(resultado);
		
		String time = "Fluminense";
		
		String resposta = switch(time){
		case "Flamengo", "Vasco", "Botafogo", "Fluminense"-> "Rio de Janeiro";
		case "Sao Paulo", "Palmeiras", "Santos", "Corinthias"-> "Sao Paulo";
		default-> "Outro Estado";
		};
		
		System.out.println(resposta);
		
	}
}
