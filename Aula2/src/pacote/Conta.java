package pacote;

public class Conta {
	
	private int numero;
	private String titular;
	private double saldo;
	
	
	
	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public void depositar(double valor) {
		if(valor >0) {
			saldo += valor;
			System.out.println("Transacao efetuada com sucesso");
			
		}else {
			System.out.println("Deposito nao efetado");
		}
	}
	
	
	public boolean saque(double valor) {
		if(valor <= saldo) {
			saldo -= valor;
			return true;
		}
		return false;
	}
}


