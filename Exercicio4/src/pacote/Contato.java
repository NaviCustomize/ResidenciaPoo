package pacote;

import java.util.Arrays;

public class Contato {
	
	private String nome;
	private Telefone[] telefone;
	private Endereco endereco;

	public Contato(String nome, Telefone[] telefone, Endereco endereco) {
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public Telefone[] getTelefone() {
		return telefone;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void mostrarTelefone() {
		for(int i = 0;i< telefone.length;i++) {
			System.out.println("Telefone:"+ telefone[i].getNumero());
		}
	}

	@Override
	public String toString() {
		return nome + " " + Arrays.toString(telefone) + " " + endereco + " ";
	}
	
	
	
}
