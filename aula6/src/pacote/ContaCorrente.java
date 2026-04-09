package pacote;

public class ContaCorrente implements Conta {

    private String titular;
    private Double saldo;

    public ContaCorrente(String titular, Double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "titular: " + titular + ", saldo: " + saldo;
    }

    public String getTitular() {
        return titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    @Override
    public void saque(double valor) {
        if (saldo >= valor + taxaSaque) {
            saldo -= (valor + taxaSaque);
        }
    }
}
