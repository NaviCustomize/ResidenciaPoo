package pacote;

import java.time.LocalDate;

public class Moto extends Veiculo {
	
	private int cilindrada;

	public Moto(String modelo, double valorCobrado, LocalDate dataConserto, Proprietario proprietario, int cilindrada) {
		super(modelo, valorCobrado, dataConserto, proprietario);
		this.cilindrada = cilindrada;
	}

	@Override
	public double lavarVeiculo() {
		return TipoServico.LAVAGEM.getValorPorServico();
	}

	@Override
	public double trocarOleo() {
		return TipoServico.OLEO.getValorPorServico();
	}

	@Override
	public double revisao() {
		return TipoServico.REVISAO.getValorPorServico();
	}

}
