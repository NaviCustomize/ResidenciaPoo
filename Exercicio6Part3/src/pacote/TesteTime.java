package pacote;

import java.util.ArrayList;
import java.util.List;

public class TesteTime {
    public static void main(String[] args) {

        List<Time> times = new ArrayList<>();

        Time time1 = new Time("Canela negativa", "Lucas Lopes", "Fernanda");
        Time time2 = new Time("Botafogo", "João pedro", "Pedro");

        times.add(time1);
        times.add(time2);

        Atleta atleta1 = new Atleta("Paulo", 25, "Goleiro");
        Atleta atleta2 = new Atleta("Vitor", 18, "Atacante");


        time1.adicionarAtleta(atleta1);
        time1.adicionarAtleta(atleta2);

        time2.adicionarAtleta(atleta1);
        time2.adicionarAtleta(atleta2);

        for (Time time : times) {// aqui ele criou uma lista dentro da outra 
            System.out.println("Time: " + time.getNomeTime());

            for (Atleta atleta : time.getAtletas()) {
                System.out.println("- " + atleta.getNome());
            }
        }
    }

}
