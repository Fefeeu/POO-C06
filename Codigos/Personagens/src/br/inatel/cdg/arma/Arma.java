package br.inatel.cdg.arma;

public class Arma {
    private String nome;
    private int dano;
    private int durabilidade;

    public Arma(String nome, int dano, int durabilidade) {
        this.nome = nome;
        this.dano = dano;
        this.durabilidade = durabilidade;
    }

    public void setDurabilidade(int durabilidade) {
        this.durabilidade = durabilidade;
    }

    public int getDurabilidade() {
        return durabilidade;
    }

    public int getDano() {
        return dano;
    }

    public String toString() {
        return "Nome: " + nome
                + "\nDano: " + dano
                + "\nDurabilidade: " + durabilidade;
    }
}
