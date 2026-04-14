package pacote;

import java.util.ArrayList;
import java.util.List;

public class Atleta {

    private String nome;
    private int idade;
    private String posicao;
    private List<Time> times;

    public Atleta(String nome, int idade, String posicao) {
        this.nome = nome;
        this.idade = idade;
        this.posicao = posicao;
        this.times = new ArrayList<>();
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }


    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }


    public void setTimes(List<Time> times) {
        this.times = times;
    }


    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getPosicao() {
        return posicao;
    }

    public List<Time> getTimes() {
        return times;
    }

    public void adicionarTime(Time time){
        times.add(time);
    }

}
