package aula8;

import javax.swing.JOptionPane;

public class ExemploException {
	
	public static void main(String[] args)throws Exception {
		try {
			int num1 = Integer.parseInt(JOptionPane.showInputDialog("Qual o 1 numero"));
			int num2 = Integer.parseInt(JOptionPane.showInputDialog("Qual o 2 numero"));
			
			JOptionPane.showMessageDialog(null, calcular(num1,num2));	
		
		}catch(ArithmeticException e) {
			JOptionPane.showMessageDialog(null,"Valor invalido","Erro",0);
		}catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null,"Apenas valores inteiros","Erro",0);
		}
		finally {
			System.out.println("Fim de progrma");
		}
	}
	
	public static int calcular(int a,int b) {
		/*if(b==0) {
			throw new ArithmeticException("Erro! Divisao por zero");
		}*/
		return a/b;
	}
	
}
