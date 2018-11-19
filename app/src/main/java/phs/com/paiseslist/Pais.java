package phs.com.paiseslist;

public class Pais {

    private String nome;
    private int ranking;
    private int populacao;
    private int bandeira;

    public Pais(String nome, int ranking, int populacao, int bandeira) {
        this.nome = nome;
        this.ranking = ranking;
        this.populacao = populacao;
        this.bandeira = bandeira;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getRanking() {
        return ranking;
    }
    public void setRanking(int ranking) {
        this.ranking = ranking;
    }
    public int getPopulacao() {
        return populacao;
    }
    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }
    public int getBandeira() {
        return bandeira;
    }
    public void setBandeira(int bandeira) {
        this.bandeira = bandeira;
    }
}