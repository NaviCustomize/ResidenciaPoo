package pacote;

import javax.swing.JOptionPane;

public class main4 {
	
	public static void main(String [] args) {
		
		String nome = JOptionPane.showInputDialog("Informe seu nome: ");
		int telefone = Integer.parseInt(JOptionPane.showInputDialog("Informe seu telefone: "));
		String email = JOptionPane.showInputDialog("Informe seu email: ");
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe seu salario:"));
		
		FuncionarioMain4 f1 = new FuncionarioMain4(nome,telefone,email,salario);
		
		JOptionPane.showMessageDialog(null,f1.getNome()+"\n"+f1.getTelefone()+"\n"+f1.getEmail()+"\n"+f1.getSalario()+"\n"+(f1.getSalario() + f1.calcSalario()));
	}
	
}
