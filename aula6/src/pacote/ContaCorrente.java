package pacote;

public class ContaCorrente implements Conta 
{
    private String titular;
    private double saldo;

    public ContaCorrente(String titular, double saldo) 
    {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() 
    {
        return titular;
    }

    public double getSaldo() 
    {
        return saldo;
    }

    @Override
    public String toString() 
    {
        return "Conta Corrente: [Titular: " + titular + ", Saldo: " + saldo + "]";
    }

    @Override
    public void saque (double valor)
    {
        if (saldo > valor)
        {
            saldo -= valor;
        }
    }

    @Override
    public void deposito (double valor)
    {
        if (valor > 0)
        {
            saldo += valor;
        }
    }
}
