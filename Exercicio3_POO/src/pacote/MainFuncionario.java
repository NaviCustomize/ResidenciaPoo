package pacote;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MainFuncionario {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		String nome = JOptionPane.showInputDialog("Infome o seu nome");
		
		
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu salario: "));
		
		Funcionario f1 = new Funcionario(nome, salario);
		
		JOptionPane.showMessageDialog(null,"Nome: "+f1.getNome()+"\nSalario: "+f1.getSalario()+"\nINSS"+f1.calcularInss()+"\nVale Transporte: "+f1.calcularValeTransporte()+"\nSalario Liquido: "+f1.calculoSalarioLiquido());
		
	}
	
}
