package pacote;

//NÃ£o posso instanciar interface.
public interface Conta {
  public final int taxaSaque = 6;
  public abstract void saque(double valor);
  public abstract void deposito(double valor);
}
