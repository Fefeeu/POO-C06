package br.inatel.cdg.animais;

public abstract class Mamifero {
    protected String nome;
    protected double vida;

    protected Mamifero(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }
    abstract public void emitirSom();

    public void mostrarInfo(){
        System.out.println("Nome: " + nome
        + "\nVida: " + vida);
    }
}
