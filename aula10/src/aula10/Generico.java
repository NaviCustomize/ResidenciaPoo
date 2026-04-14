package aula10;

public class Generico<T> {
	
	private T valor;

	public Generico(T valor) {
		super();
		this.valor = valor;
	}

	public T getValor() {
		return valor;
	}
	
}
