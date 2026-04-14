package pacote;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Carro extends Veiculo {

    private String categoria;

    public Carro(String modelo, double valorCobrado, LocalDate dataConserto, Proprietario proprietario) {
        super(modelo, valorCobrado, dataConserto, proprietario);
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public double trocarOleo() {
        if (dataConserto.getDayOfWeek() == DayOfWeek.SATURDAY) {
            return valorCobrado += TipoServico.OLEO.getValorPorServico() - 50;
        }
        return valorCobrado += TipoServico.OLEO.getValorPorServico();
    }

    @Override
    public double revisao() {
        if (dataConserto.getMonth() == Month.AUGUST) {
            return valorCobrado += TipoServico.REVISAO.getValorPorServico() * 0.90;
        }
        return valorCobrado += TipoServico.REVISAO.getValorPorServico();
    }

    @Override
    public double lavarVeiculo() {
        return valorCobrado += TipoServico.LAVAGEM.getValorPorServico();
    }

}
