package pacote;

import java.time.LocalDate;

public class Cavalo extends Mamifero {

    private String marcaFerradura;

    public Cavalo(String nome, LocalDate dataVacinacao, String raca) {
        super(nome, dataVacinacao, raca);
    }

    @Override
    public void amamentar() {
    }

    @Override
    public String emitirSom() {
        return "Relinchar";
    }

}
