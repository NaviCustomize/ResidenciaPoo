package pacote;

import java.util.ArrayList;
import java.util.List;

public class Time {
    private String nomeTime;
    private String tecnico;
    private String diretor;
    private List<Atleta> atletas;


    public Time(String nomeTime, String tecnico, String diretor) {
        this.nomeTime = nomeTime;
        this.tecnico = tecnico;
        this.diretor = diretor;
        this.atletas = new ArrayList<>(); // fizemos a lista aqui

    }

    @Override // ele vai sempre reescrever em relação ao ultimo. 
    public String toString() {
        return " Nome Time: " + nomeTime + ", Técnico: " + tecnico + ", Diretor: " + diretor;
    }

    public String getNomeTime() {
        return nomeTime;
    }

    public String getTecnico() {
        return tecnico;
    }

    public String getDiretor() {
        return diretor;
    }

    public List<Atleta> getAtletas() {
        return atletas;
    }


    public void adicionarAtleta(Atleta atleta){
        atletas.add(atleta);
        atleta.adicionarTime(this);// add o proprio time no atleta
    }

}

